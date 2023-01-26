package leetcode.p162;

/**
 * https://leetcode.com/problems/find-peak-element/
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findPeakElement(new int[]{1, 2, 3, 1})); // 2
        System.out.println(s.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4})); // 5
    }
}
