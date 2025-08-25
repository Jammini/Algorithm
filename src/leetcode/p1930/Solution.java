package leetcode.p1930;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countPalindromicSubsequence(String s) {
        int answer = 0;
        for(char currentChar = 'a'; currentChar <= 'z'; currentChar++) {
            Set<Character> set = new HashSet<>();
            int left = s.indexOf(currentChar);
            int right = s.lastIndexOf(currentChar);
            for(int j = left + 1; j < right; j++) {
                set.add(s.charAt(j));
            }
            answer += set.size();
        }
        return answer;
    }
}
