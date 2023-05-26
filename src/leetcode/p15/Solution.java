package leetcode.p15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int num = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int threeSum = num + nums[left] + nums[right];
                if (threeSum < 0) {
                    left++;
                } else if (threeSum > 0) {
                    right--;
                } else {
                    set.add(Arrays.asList(num, nums[left], nums[right]));
                    right--;
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
