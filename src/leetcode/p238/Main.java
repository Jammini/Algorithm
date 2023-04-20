package leetcode.p238;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().productExceptSelf(new int[]{1, 2, 3, 4}))); // [24,12,8,6]
        System.out.println(Arrays.toString(new Solution().productExceptSelf(new int[]{-1, 1, 0, -3, 3}))); //[0,0,9,0,0]
    }
}
