package leetcode.p1559;

public class Solution {
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    public boolean containsCycle(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j]) {
                    continue;
                }

                boolean check = dfs(grid, visited, i, j, -1, -1, grid[i][j]);
                if (check) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, boolean[][] visited, int x, int y, int beforeX, int beforeY, char target) {
        boolean check = false;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if((nx == beforeX && ny == beforeY) || nx < 0 || nx >= grid.length || ny < 0 || ny >= grid[0].length || grid[nx][ny] != target) {
                continue;
            }

            if (visited[nx][ny]) {
                return true;
            }

            if(grid[nx][ny] == target) {
                visited[nx][ny] = true;
                check = dfs(grid, visited, nx, ny, x, y, target);
            }
        }
        return check;
    }
}
