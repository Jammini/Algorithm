package leetcode.p807;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(s.maxIncreaseKeepingSkyline(grid));

    }
}
