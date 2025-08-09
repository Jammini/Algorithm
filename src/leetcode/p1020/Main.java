package leetcode.p1020;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().numEnclaves(new int[][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}})); // 3
        System.out.println(new Solution().numEnclaves(new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}})); // 0
    }
}
