package leetcode.P3;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 1;
        HashSet set = new HashSet();

        if ("".equals(s)) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                count++;
            } else {
                if (answer < count){
                    answer = count;
                }
                i = i - count;
                count = 0;
                set.clear();
            }
        }
        if (answer < count){
            answer = count;
        }
        return answer;
    }
}
