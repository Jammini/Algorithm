package programmers.p42576;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) -1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                answer = s;
                break;
            }
        }
        return answer;
    }
}
