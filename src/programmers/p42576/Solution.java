package programmers.p42576;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();


        for (String value : participant) {
            int index = 1;
            if (map.containsKey(value)) {
                index = map.get(value) + 1;
            }
            map.put(value, index);
        }
        for (String s : completion) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) - 1);
            }
        }
        return (String) getKey(map, 1);
    }

    public static Object getKey(Map<String, Integer> m, Object value) {
        for (Object o : m.keySet()) {
            if (m.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
}
