package leetcode.p207;

/**
 * https://leetcode.com/problems/course-schedule/description/
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().canFinish(2, new int[][]{{1, 0}})); // true
        System.out.println(new Solution().canFinish(2, new int[][]{{1, 0}, {0, 1}})); // false
        System.out.println(new Solution().canFinish(20, new int[][]{{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}})); // false
    }
}
