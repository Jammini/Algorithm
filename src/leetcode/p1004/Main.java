package leetcode.p1004;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2)); // 6
        System.out.println(s.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3)); // 10
        System.out.println(s.longestOnes(new int[]{0, 0, 0, 1}, 4)); // 4
        System.out.println(s.longestOnes(new int[]{0, 1, 0, 0, 0, 1}, 4)); // 6
        System.out.println(s.longestOnes(new int[]{1, 1, 0, 0, 0, 1, 0, 0, 0}, 4)); // 7
        System.out.println(s.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 0)); // 4
        System.out.println(s.longestOnes(new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1)); // 10
    }
}
