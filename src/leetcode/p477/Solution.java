package leetcode.p477;

public class Solution {
    public int totalHammingDistance(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                answer += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return answer;
    }
}