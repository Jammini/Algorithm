package practice.implementation.p5;

import java.util.*;
class Solution {
	public int solution(int[] nums){
		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			int lCount = 0;
			int rCount = 0;
			int lNum = i;
			int rNum = i;

			while (lNum - 1 > 0 && nums[lNum] > nums[lNum - 1]) {
				lCount++;
				lNum--;
			}

			while (rNum + 1 < nums.length && nums[rNum] > nums[rNum + 1]) {
				rCount++;
				rNum++;
			}
			answer = Math.max(answer, lCount + rCount + 1);
		}

		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
		System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
	}
}