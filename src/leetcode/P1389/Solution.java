package leetcode.P1389;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] result = new int[nums.length];

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < length; i++) {
            if (result[index[i]] >= 0) {
                for (int j = length - 1; j > index[i]; j--) {
                    result[j] = result[j - 1];
                }
            }
            result[index[i]] = nums[i];
        }


        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

        return result;
    }
}
