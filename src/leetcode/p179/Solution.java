package leetcode.p179;

import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] nums) {
        String[] num = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            num[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(num, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));

        StringBuilder sb = new StringBuilder();
        for (String s : num) {
            sb.insert(0, s);
        }
        if (sb.toString().charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}
