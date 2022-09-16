package programmers.p42889;

import java.util.*;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap();
        Arrays.sort(stages);

        int[] arr = new int[stages.length + 1];

        for (int i = 0; i < stages.length; i++) {
            arr[i] = stages[i];
            if (i == stages.length - 1) {
                arr[i + 1] = N + 1;
            }
        }

        int key = 1;
        double index = 0.0;
        for (int j = 0; j < arr.length; j++) {
            if (key == arr[j]) {
                index++;
            } else {
                if (key == N + 1) {
                    break;
                }
                map.put(key, map.getOrDefault(key, index != 0 ? index / (stages.length - j + index) : 0));
                index = 0;
                key++;
                j--;
            }
        }

        List<Integer> keySetList = new ArrayList<>(map.keySet());
        // 내림차순
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        int idx = 0;
        for (Integer key1 : keySetList) {
            answer[idx++] = key1;
        }
        return answer;
    }
}
