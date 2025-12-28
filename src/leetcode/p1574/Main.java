package leetcode.p1574;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().findLengthOfShortestSubarray(new int[]{1, 2, 3, 10, 4, 2, 3, 5})); // 3
        System.out.println(new Solution().findLengthOfShortestSubarray(new int[]{5, 4, 3, 2, 1})); // 4
        System.out.println(new Solution().findLengthOfShortestSubarray(new int[]{1, 2, 3})); // 0
    }
}
