package leetcode.p1605;

public class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] answer = new int[rowSum.length][colSum.length];

        for(int i = 0; i < rowSum.length; i++) {
            for(int j = 0; j < colSum.length; j++) {
                int value = Math.min(rowSum[i], colSum[j]);
                answer[i][j] = value;
                rowSum[i] -= value;
                colSum[j] -= value;
            }
        }
        return answer;
    }
}
