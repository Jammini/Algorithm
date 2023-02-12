package leetcode.p310;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}})); // [1]
        System.out.println(new Solution().findMinHeightTrees(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}})); // [3, 4]
    }
}