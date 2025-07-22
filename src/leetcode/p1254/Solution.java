package leetcode.p1254;

public class Solution {
    boolean[][] visited;
    int[] x = {-1, 0, 1, 0};
    int[] y = {0, 1, 0, -1};
    public int closedIsland(int[][] grid) {
        int answer = 0;
        visited = new boolean[grid.length][grid[0].length];

        // 위쪽 가장자리
        for(int j = 0; j < grid[0].length; j++) {
            if(grid[0][j] == 0) {
                dfs(0, j, grid);
            }
        }

        // 아래쪽 가장자리
        for(int j = 0; j < grid[0].length; j++) {
            if(grid[grid.length - 1][j] == 0) {
                dfs(grid.length - 1, j, grid);
            }
        }

        // 왼쪽 가장자리
        for(int j = 0; j < grid.length; j++) {
            if(grid[j][0] == 0) {
                dfs(j,0, grid);
            }
        }

        // 오른쪽 가장자리
        for(int j = 0; j < grid.length; j++) {
            if(grid[j][grid[0].length - 1] == 0) {
                dfs(j, grid[0].length - 1, grid);
            }
        }

        for(int i = 1; i < grid.length - 1; i++) {
            for(int j = 1; j < grid[0].length - 1; j++) {
                if(!visited[i][j] && grid[i][j] == 0) {
                    answer++;
                    dfs(i, j, grid);
                }
            }
        }
        return answer;
    }
    public void dfs(int i, int j, int[][] grid) {
        if(grid[i][j] == 0) {
            visited[i][j] = true;
        }

        for(int k = 0; k < 4; k++) {
            if(i + x[k] >= 0 && i + x[k] < grid.length &&
                   j + y[k] >= 0 && j + y[k] < grid[0].length &&
                   !visited[i + x[k]][j + y[k]] && grid[i + x[k]][j+y[k]] == 0) {
                dfs(i + x[k], j + y[k], grid);
            }
        }
    }
}
