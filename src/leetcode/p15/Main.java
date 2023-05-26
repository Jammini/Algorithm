package leetcode.p15;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4})); // [[-1,-1,2],[-1,0,1]]
        System.out.println(new Solution().threeSum(new int[]{0, 1, 1})); // []
        System.out.println(new Solution().threeSum(new int[]{0, 0, 0})); // [0,0,0]
    }
}
