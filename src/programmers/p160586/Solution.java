package programmers.p160586;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            char[] array = key.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (!map.containsKey(array[i])) {
                    map.put(array[i], i + 1);
                } else if (map.get(array[i]) > i + 1) {
                    map.put(array[i], i + 1);
                }
            }
        }

        int index = 0;
        for (String target : targets) {
            for (char c : target.toCharArray()) {
                if(!map.containsKey(c))  {
                    answer[index] = -1;
                    break;
                } else {
                    answer[index] += map.get(c);
                }
            }
            index++;
        }
        return answer;
    }
}
