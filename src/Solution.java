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


    public static void main(String[] args) {
        Solution s = new Solution();


        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        s.createTargetArray(nums, index);
    }
}
