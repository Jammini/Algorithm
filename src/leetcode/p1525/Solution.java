package leetcode.p1525;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numSplits(String s) {
        Map<Character, Integer> leftMap = new HashMap<>();
        Map<Character, Integer> rightMap = new HashMap<>();
        int answer = 0;

        for (char c : s.toCharArray()) {
            leftMap.put(c, leftMap.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            rightMap.put(c, rightMap.getOrDefault(c, 0) + 1);
            leftMap.put(c, leftMap.getOrDefault(c, 0) - 1);
            if (leftMap.get(c) <= 0) {
                leftMap.remove(c);
            }
            if (leftMap.size() == rightMap.size()) {
                answer++;
            }
        }
        return answer;
    }
}
