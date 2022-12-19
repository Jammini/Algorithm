package programmers.p86491;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
        int row = Integer.MIN_VALUE;
        int col = Integer.MIN_VALUE;
        for (int[] size : sizes) {
            Arrays.sort(size);
            row = Math.max(row, size[0]);
            col = Math.max(col, size[1]);
        }
        return col * row;
    }
}
