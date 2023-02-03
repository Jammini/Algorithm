package leetcode.p1004;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int[] arr = Arrays.copyOf(nums, nums.length + 1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(-1);

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == 0) {
                if (k <= 0 || i == nums.length) {
                    max = Math.max(max, (i - 1) - (queue.poll() + 1) + 1);
                } else {
                    k--;
                }
                queue.offer(i);
            }
        }
        return max;
    }
}
