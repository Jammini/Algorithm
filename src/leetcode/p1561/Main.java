package leetcode.p1561;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxCoins(new int[]{2, 4, 1, 2, 7, 8})); // 9
        System.out.println(s.maxCoins(new int[]{2, 4, 5})); // 4
        System.out.println(s.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4})); // 18
    }
}
