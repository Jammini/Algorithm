package leetcode.p1254;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().closedIsland(new int[][]{{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}})); // 2
        System.out.println(new Solution().closedIsland(new int[][]{{0,0,1,0,0},{0,1,0,1,0},{0,1,1,1,0}})); // 1
    }
}
