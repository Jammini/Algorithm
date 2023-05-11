package leetcode.p994;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}})); // 4
        System.out.println(new Solution().orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}})); // -1
        System.out.println(new Solution().orangesRotting(new int[][]{{0, 2}})); // 0
        System.out.println(new Solution().orangesRotting(new int[][]{{0}})); // 0
    }
}
