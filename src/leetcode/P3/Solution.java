package leetcode.P3;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet set = new HashSet();

        for(int i= 0; i<s.length(); i++){
            set.add(s.charAt(i));
        }


        return set.size();
    }
}
