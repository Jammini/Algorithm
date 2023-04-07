package leetcode.p49;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String value = String.valueOf(chars);
            List<String> list = map.getOrDefault(value, new ArrayList<>());
            list.add(s);
            map.put(value, list);
        }
        return new ArrayList<>(map.values());
    }
}
