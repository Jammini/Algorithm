package programmers.p17684;

import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        String[] message = msg.split("");

        for (int i = 0; i < message.length; i++) {
            String dic1 = message[i];
            String dic2 = dic1;
            for (int j = i + 1; j < message.length; j++) {
                dic2 = dic1 + message[j];
                if (!map.containsKey(dic2)) {
                    break;
                }
                dic1 += message[j];
                i++;
            }
            int num = map.get(dic1);
            list.add(num);
            map.put(dic2, map.size() + 1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}