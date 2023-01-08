package leetcode.p383;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (Character character : map.keySet()) {
            if (map.get(character) > 0) {
                return false;
            }
        }
        return true;
    }
}
