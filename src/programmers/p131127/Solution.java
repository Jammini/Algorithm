package programmers.p131127;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            map2.putAll(map);
            for (int j = i; j < (i + 10); j++) {
                if (map2.containsKey(discount[j])) {
                    map2.put(discount[j], map2.get(discount[j]) - 1);
                }
            }
            boolean flag = true;
            for (String s : map2.keySet()) {
                if (map2.get(s) > 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
            map2.clear();
        }
        return answer;
    }
}
