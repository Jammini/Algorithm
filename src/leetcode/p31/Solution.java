package leetcode.p31;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        int i = length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        Arrays.sort(nums, i + 1, length);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
