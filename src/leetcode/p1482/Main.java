package leetcode.p1482;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().minDays(new int[]{1, 10, 3, 10, 2}, 3, 1)); // 3
        System.out.println(new Solution().minDays(new int[]{1, 10, 3, 10, 2}, 3, 2)); // -1
        System.out.println(new Solution().minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3)); // 12
    }
}
