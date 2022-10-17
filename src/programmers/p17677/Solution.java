package programmers.p17677;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Solution {
    Map<String, Integer> map1 = new HashMap();
    Map<String, Integer> map2 = new HashMap();

    public int solution(String str1, String str2) {
        int answer = 0;
        double intersection = 0;
        int union = 0;
        mapStore(str1, true);
        mapStore(str2, false);

        for (String str : map2.keySet()) {
            while (map1.containsKey(str) && map1.get(str) > 0 && map2.get(str) > 0) {
                intersection++;
                map1.put(str, map1.get(str) - 1);
                map2.put(str, map2.get(str) - 1);
            }
        }

        for (String str : map1.keySet()) {
            union += map1.get(str);
        }
        for (String str : map2.keySet()) {
            union += map2.get(str);
        }
        System.out.println(intersection);
        System.out.println(union);

        union = union + (int) intersection;

        if (union == 0) {
            return 65536;
        } else {
            answer = (int) ((intersection / union) * 65536);
        }
        return answer;
    }

    public void mapStore(String str, boolean flag) {
        for (int i = 0; i < str.length() - 1; i++) {
            String sub = str.substring(i, i + 2);
            if (Pattern.matches("^[a-zA-Z]*$", sub)) {
                if (flag) {
                    map1.put(sub.toLowerCase(), map1.getOrDefault(sub.toLowerCase(), 0) + 1);
                } else {
                    map2.put(sub.toLowerCase(), map2.getOrDefault(sub.toLowerCase(), 0) + 1);
                }
            }
        }
    }
}
