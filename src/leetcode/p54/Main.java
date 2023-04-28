package leetcode.p54;

/**
 * https://leetcode.com/problems/spiral-matrix/
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})); // [1,2,3,6,9,8,7,4,5]
        System.out.println(new Solution().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})); // [1,2,3,4,8,12,11,10,9,5,6,7]
    }
}
