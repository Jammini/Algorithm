package leetcode.p1631;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().minimumEffortPath(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}})); // 2
        System.out.println(new Solution().minimumEffortPath(new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}})); // 1
        System.out.println(new Solution().minimumEffortPath(new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}})); // 0
    }
}
