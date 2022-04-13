package leetcode.p1470;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = (i%2==1) ? nums[n++] : nums[i/2];
        }

        return answer;
    }

}
