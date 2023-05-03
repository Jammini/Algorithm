package leetcode.p424;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int characterReplacement(String s, int k) {
        String[] str = s.split("");
        Map<String, Integer> map = new HashMap<>();
        int answer = Integer.MIN_VALUE;
        int left = 0;
        int maxCount = 0;
        for (int right = 0; right < str.length; right++) {
            map.put(str[right], map.getOrDefault(str[right], 0) + 1);
            maxCount = Math.max(maxCount, map.get(str[right]));

            if (right - left + 1 - maxCount > k) {
                map.put(str[left], map.getOrDefault(str[left], 0) - 1);
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }
}