package leetcode.p1631;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int[][] minEffort = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(minEffort[i], Integer.MAX_VALUE);
        }

        minEffort[0][0] = 0;
        int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[]{0, 0});

        while (!dq.isEmpty()) {
            int[] node = dq.pollFirst();
            int x = node[0];
            int y = node[1];
            for (int i = 0; i < 4; i++) {
                int dx = x + dir[i][0];
                int dy = y + dir[i][1];
                if (dx >= 0 && dx < minEffort.length && dy >= 0 && dy < minEffort[0].length) {
                    if (minEffort[dx][dy] > Math.max(minEffort[x][y], Math.abs(heights[x][y] - heights[dx][dy]))) {
                        minEffort[dx][dy] = Math.max(minEffort[x][y], Math.abs(heights[x][y] - heights[dx][dy]));
                        dq.addLast(new int[]{dx, dy});
                    }
                }
            }
        }
        return minEffort[minEffort.length - 1][minEffort[0].length - 1];
    }
}
