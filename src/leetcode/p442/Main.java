package leetcode.p442;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1})); // [2, 3]
        System.out.println(s.findDuplicates(new int[]{1, 1, 2})); // [1]
        System.out.println(s.findDuplicates(new int[]{1})); // []
    }
}
