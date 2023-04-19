package leetcode.p238;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int zeroCnt = 0;
        int zeroIndex = 0;
        int total = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCnt++;
                zeroIndex = i;
            } else {
                total *= nums[i];
            }
        }

        if (zeroCnt > 1) {
            return answer;
        } else if (zeroCnt == 1) {
            answer[zeroIndex] = total;
        } else {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = total / nums[i];
            }
        }
        return answer;
    }
}