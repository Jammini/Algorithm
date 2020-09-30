package leetcode.P414;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int thirdMax(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (int j = 0; j < 3; j++) {
            max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i] && !list.contains(nums[i])) {
                    max = nums[i];
                }
            }
            if (max != Integer.MIN_VALUE && !list.contains(max)) {
                list.add(max);
            }
        }
        System.out.println(list.toString());
        if (list.size() - 1 != 2) {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(i);
                if (nums[i] == Integer.MIN_VALUE) {
                    System.out.println("ok");
                    list.add(nums[i]);
                }
            }
        }
        if (list.size() - 1 != 2) {
            max = list.get(0);
        } else {
            max = list.get(list.size() - 1);
        }
        return max;
    }
}
