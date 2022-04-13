package leetcode.p807;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] garo = new int[grid.length];
        int[] sero = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(garo[i] < grid[i][j]){
                    garo[i] = grid[i][j];
                }
                if(sero[i] < grid[j][i]){
                    sero[i] = grid[j][i];
                }
            }
        }

        // 가로 [8, 7, 9, 3] // 세로 [9, 4, 8, 7]

        int answer =0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                answer += Math.min(garo[i],sero[j]) - grid[i][j];
            }
        }


        return answer;
    }
}
