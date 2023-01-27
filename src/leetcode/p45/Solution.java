package leetcode.p45;

public class Solution {
    public int jump(int[] nums) {
        int depth = 0;
        int current = -1;
        int jump = 0;

        for (int i = 0; jump < nums.length - 1; i++) {
            if (i > current) {
                depth++;
                current = jump;
            }
            jump = Math.max(jump, i + nums[i]);
        }
        return depth;
    }
}
