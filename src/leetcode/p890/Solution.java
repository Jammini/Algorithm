package leetcode.p890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (isChecked(word, pattern)) {
                list.add(word);
            }
        }
        return list;
    }

    private boolean isChecked(String word, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            Character w = word.charAt(i);
            Character p = pattern.charAt(i);

            if (!map1.containsKey(w)) {
                map1.put(w, p);
            }
            if (!map2.containsKey(p)) {
                map2.put(p, w);
            }
            if (map1.get(w) != p || map2.get(p) != w) {
                return false;
            }
        }
        return true;
    }
}
