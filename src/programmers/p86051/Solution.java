package programmers.p86051;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] nums = new int[10];
        Arrays.sort(numbers);

        for (int number : numbers) {
            nums[number] = number;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
