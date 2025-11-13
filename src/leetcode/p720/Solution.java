package leetcode.p720;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String result = "";

        for (String word : words) {
            // 길이 1 이거나 접두사가 이미 만들어진 경우에만 허용
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                // 길이가 더 길면 갱신
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }
}
