package leetcode.p54;

import java.util.*;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix[0].length;

        while (true) {
            // 우측
            for (int i = left; i < right; i++) {
                answer.add(matrix[top][i]);
            }
            top++;
            if (top >= bottom) {
                break;
            }
            // 아래
            for (int i = top; i < bottom; i++) {
                answer.add(matrix[i][right - 1]);
            }
            right--;
            if (left >= right) {
                break;
            }
            // 왼쪽
            for (int i = right - 1; i >= left; i--) {
                answer.add(matrix[bottom - 1][i]);
            }
            bottom--;
            if (top >= bottom) {
                break;
            }
            // 위쪽
            for (int i = bottom - 1; i >= top; i--) {
                answer.add(matrix[i][left]);
            }
            left++;
            if (left >= right) {
                break;
            }
        }
        return answer;
    }
}
