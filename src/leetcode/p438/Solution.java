package leetcode.p438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();

        for (char c : p.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            pMap.put(s.charAt(right), pMap.getOrDefault(s.charAt(right), 0) + 1);
            if (right + 1 >= p.length()) {
                if (sMap.equals(pMap)) {
                    list.add(left);
                }
                pMap.put(s.charAt(left), pMap.getOrDefault(s.charAt(left), 0) - 1);
                if (pMap.get(s.charAt(left)) <= 0) {
                    pMap.remove(s.charAt(left));
                }
                left++;
            }
        }
        return list;
    }
}