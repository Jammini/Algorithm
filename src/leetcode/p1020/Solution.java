package leetcode.p1020;

import java.util.*;

public class Solution {
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    public int numEnclaves(int[][] grid) {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < grid.length; i++) {
            // 왼쪽 테두리
            if(grid[i][0] == 1) {
                grid[i][0] = 0;
                q.offer(new int[]{i,0});
            }

            // 오른쪽 테두리
            if(grid[i][grid[0].length - 1] == 1) {
                grid[i][grid[0].length - 1] = 0;
                q.offer(new int[]{i, grid[0].length - 1});
            }
        }
        for(int i = 0; i < grid[0].length; i++) {
            // 위쪽 테두리
            if(grid[0][i] == 1) {
                grid[0][i] = 0;
                q.offer(new int[]{0, i});
            }

            // 아래쪽 테두리
            if(grid[grid.length - 1][i] == 1) {
                grid[grid.length - 1][i] = 0;
                q.offer(new int[]{grid.length - 1, i});
            }
        }

        while(!q.isEmpty()) {
            int[] cur = q.poll();

            for(int i = 0; i < 4; i++) {
                int lx = cur[0] + dx[i];
                int ly = cur[1] + dy[i];
                if(lx >= 0 && lx < grid.length && ly >= 0 && ly < grid[0].length - 1 && grid[lx][ly] == 1) {
                    grid[lx][ly] = 0;
                    q.offer(new int[]{lx, ly});
                }

            }
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    answer++;
                }
            }
        }
        return answer;
    }
}
