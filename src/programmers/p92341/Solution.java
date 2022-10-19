package programmers.p92341;

import java.util.*;

public class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap();
        Map<String, Integer> map2 = new HashMap();
        List<String> list = new ArrayList<>();

        for (String s : records) {
            String[] record = s.split(" "); // record를 나눔.
            String[] time = record[0].split(":"); // ex)11:12 시와 분으로 쪼갬.
            if ("IN".equals(record[2])) { // 입차인 경우
                int minute = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
                map.put(record[1], minute);
            } else { // 출차 인경우
                int minute = (Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1])) - map.get(record[1]);
                map.put(record[1], -1); // 출차가 완료된 경우 -1
                map2.put(record[1], map2.getOrDefault(record[1], 0) + minute);
            }
        }

        // 입차했으나 출차가 안된 차량 조회
        for (String str : map.keySet()) {
            if (map.get(str) != -1) {
                int minute = 1439 - map.get(str);
                map2.put(str, map2.getOrDefault(str, 0) + minute);
            }
        }

        // 요금 계산
        for (String str : map2.keySet()) {
            int minute = map2.get(str) - fees[0];
            if (minute <= 0) {
                map2.put(str, fees[1]);
            } else {
                if (minute % fees[2] != 0) {
                    minute = minute + fees[2];
                }
                int price = fees[1] + minute / fees[2] * fees[3];
                map2.put(str, price);
            }
        }

        // 차량 번호순 정렬을 위해 list에 담아 정렬
        for (String str : map2.keySet()) {
            list.add(str);
        }
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = map2.get(list.get(i));
        }
        return answer;
    }
}
