package leetcode.P1221;

import java.util.HashSet;

public class Solution {
    public int balancedStringSplit(String s) {

        HashSet<Character> set = new HashSet<>();
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        set.add('R');
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                count1++;
            } else {
                count2++;
            }
            if (count1 == count2) {
                answer++;
                count1 = 0;
                count2 = 0;
            }
        }

        return answer;
    }
}
