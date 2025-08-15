package leetcode.p3619;

public class Solution {

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    boolean[][] visited;

    public int countIslands(int[][] grid, int k) {
        int answer = 0;
        visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0 && !visited[i][j]) {
                    visited[i][j] = true;
                    int sum = dfs(grid, i, j);
                    if (sum % k == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public int dfs(int[][] grid, int i, int j) {
        int sum = grid[i][j];

        for (int a = 0; a < 4; a++) {
            int x = i + dx[a];
            int y = j + dy[a];

            if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] > 0
                    && !visited[x][y]) {
                visited[x][y] = true;
                sum += dfs(grid, x, y);
            }
        }
        return sum;
    }
}
