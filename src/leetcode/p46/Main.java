package leetcode.p46;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1,2,3})); // [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        System.out.println(new Solution().permute(new int[]{0,1})); // [[0,1],[1,0]]
        System.out.println(new Solution().permute(new int[]{1})); // [[1]]
    }
}
