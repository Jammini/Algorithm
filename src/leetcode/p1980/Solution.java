package leetcode.p1980;

import java.util.*;

public class Solution {
    Set<String> set;
    List<String> list = new ArrayList<>();
    public String findDifferentBinaryString(String[] nums) {
        set = new HashSet<>();
        set.addAll(Arrays.asList(nums));
        dfs(nums, "");
        return list.get(0);
    }

    public void dfs(String[] nums, String current) {
        if(current.length() >= nums[0].length()) {
            if(!set.contains(current)) {
                list.add(current);
            }
            return;
        }
        dfs(nums, current + "0");
        dfs(nums, current + "1");
    }
}
