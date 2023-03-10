package leetcode.p31;

/**
 * https://leetcode.com/problems/next-permutation/
 */
public class Main {
    public static void main(String[] args) {
        new Solution().nextPermutation(new int[]{1, 2, 3}); // [1, 3, 2]
        new Solution().nextPermutation(new int[]{3, 2, 1}); // [1, 2, 3]
        new Solution().nextPermutation(new int[]{1, 1, 5}); // [1, 5, 1]
    }
}
