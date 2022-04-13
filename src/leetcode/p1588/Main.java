package leetcode.p1588;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1, 4, 2, 5, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {10, 11, 12};

        System.out.println(s.sumOddLengthSubarrays(arr1));
        System.out.println(s.sumOddLengthSubarrays(arr2));
        System.out.println(s.sumOddLengthSubarrays(arr3));
    }
}
