package practice.implementation.p3;

import java.util.*;
class Solution {
	public int solution(int[][] board){
		int answer = 0;
		int time = 0;
		// 시계방향
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		int peopleX = 0;
		int peopleY = 0;
		int peopleLocation = 0;
		boolean peopleFlog = true;
		int dogX = 0;
		int dogY = 0;
		int dogLocation = 0;
		boolean dogFlag = true;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 2) {
					peopleX = i;
					peopleY = j;
				} else if (board[i][j] == 3) {
					dogX = i;
					dogY = j;
				}
			}
		}

		while (time < 10000) {
			if (peopleX == dogX && peopleY == dogY) {
				return time;
			} else {
				int pn = peopleX + dx[peopleLocation];
				int pm = peopleY + dy[peopleLocation];
				if (pn < 0 || pn >= board.length || pm < 0 || pm >= board[0].length || board[pn][pm] == 1) {
					peopleLocation = (peopleLocation + 1) % 4;
					peopleFlog = false;
				}
				if (peopleFlog) {
					peopleX = pn;
					peopleY = pm;
				}
				peopleFlog = true;

				int dn = dogX + dx[dogLocation];
				int dm = dogY + dy[dogLocation];
				if (dn < 0 || dn >= board.length || dm < 0 || dm >= board[0].length || board[dn][dm] == 1) {
					dogLocation = (dogLocation + 1) % 4;
					dogFlag = false;
				}
				if (dogFlag) {
					dogX = dn;
					dogY = dm;
				}
				dogFlag = true;
			}
			time++;
		}

		if (time >= 10000) {
			answer = 0;
		}

		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 2, 0, 0}, 
			{1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 3, 0, 0, 0, 1}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
			{0, 1, 0, 1, 0, 0, 0, 0, 0, 0}}; 
		System.out.println(T.solution(arr1));
		int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 1, 0, 0, 0, 0, 0, 2, 1}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 1}, 
			{0, 1, 0, 1, 0, 0, 0, 0, 0, 3}}; 
		System.out.println(T.solution(arr2));
	}
}