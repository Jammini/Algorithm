package leetcode.p3619;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().countIslands(new int[][]{{0,2,1,0,0},{0,5,0,0,5},{0,0,1,0,0},{0,1,4,7,0},{0,2,0,0,8}}, 5)); // 2
        System.out.println(new Solution().countIslands(new int[][]{{3,0,3,0}, {0,3,0,3}, {3,0,3,0}}, 3)); // 6
    }
}
