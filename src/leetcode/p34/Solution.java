package leetcode.p34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        answer[0] = saveIndex(nums, target, true); // startIndex
        answer[1] = saveIndex(nums, target, false); // endIndex
        return answer;
    }

    private int saveIndex(int[] nums, int target, boolean flag) {
        int mid;
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                index = mid;
                if (flag) { // startIndex
                    end = mid - 1;
                } else { // endIndex
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}
