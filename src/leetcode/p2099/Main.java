package leetcode.p2099;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.maxSubsequence(new int[]{2, 1, 3, 3}, 2))); // [3, 3]
        System.out.println(Arrays.toString(s.maxSubsequence(new int[]{-1, -2, 3, 4}, 3))); // [-1, 3, 4]
    }
}
