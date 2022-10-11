package programmers.p64065;

import java.util.*;

public class Solution {
    public int[] solution(String s) {
        s = s.replace("{", "").replace("}", "");
        String[] str = s.split(",");
        Map<String, Integer> map = new HashMap<>();

        for (String s1 : str) {
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }

        int[] answer = new int[map.size()];
        for (String s1 : map.keySet()) {
            answer[map.size() - map.get(s1)] = Integer.parseInt(s1);
        }
        return answer;
    }
}
