package programmers.p43238;

import java.util.Arrays;

public class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long start = 0;
        long end = (long) times[times.length - 1] * n;
        long mid;

        while(start <= end) {
            mid = (start + end) / 2;
            long sum = 0;
            for (int time : times) {
                sum += mid / time;
            }
            if (sum >= n) {
                end = mid - 1;
                answer = mid;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(6, new int[]{7, 10}));
    }
}