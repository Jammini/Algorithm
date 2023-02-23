package leetcode.p34;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8))); // [3, 4]
        System.out.println(Arrays.toString(new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6))); // [-1, -1]
        System.out.println(Arrays.toString(new Solution().searchRange(new int[]{}, 0))); // [-1, -1]
    }
}
