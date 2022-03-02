package leetcode.P228.java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + 1 != nums[i + 1 < nums.length ? i + 1 : nums.length - 1]) {
                if (num == i) {
                    list.add("" + nums[i]);
                } else {
                    list.add("" + nums[num] + "->" + nums[i]);
                }
                num = i + 1;
            }
        }
        return list;
    }
}
