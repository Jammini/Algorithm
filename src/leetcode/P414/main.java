package leetcode.P414;

public class main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Solution2 s2 = new Solution2();

        int[] nums = {3, 2, 1};
        int[] nums1 = {1, 2};
        int[] nums2 = {2, 2, 3, 1};
        int[] nums3 = {1, 1, 2};
        int[] nums4 = {5, 2, 2};
        int[] nums5 = {1, 2, 2, 5, 3, 5};
        int[] nums6 = {1, 2, -2147483648};

        System.out.println(s.thirdMax(nums));
        System.out.println(s.thirdMax(nums1));
        System.out.println(s.thirdMax(nums2));
        System.out.println(s.thirdMax(nums3));
        System.out.println(s.thirdMax(nums4));
        System.out.println(s.thirdMax(nums5));
        System.out.println(s.thirdMax(nums6));

        System.out.println(s2.thirdMax(nums));
        System.out.println(s2.thirdMax(nums1));
        System.out.println(s2.thirdMax(nums2));
        System.out.println(s2.thirdMax(nums3));
        System.out.println(s2.thirdMax(nums4));
        System.out.println(s2.thirdMax(nums5));
        System.out.println(s2.thirdMax(nums6));

    }
}
