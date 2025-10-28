package leetcode.p695;

public class Solution {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};

    public int maxAreaOfIsland(int[][] grid) {
        int maxIsland = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1 && !visited[i][j]) { // 섬이면서 방문하지 않았을 경우
                    int islandSize = dfs(grid, i, j, visited, 1);
                    maxIsland = Math.max(maxIsland, islandSize);
                }
            }
        }
        return maxIsland;
    }

    public int dfs(int[][] grid, int x, int y, boolean[][] visited, int size) {
        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx < 0 || nx >= grid.length || ny < 0 || ny >= grid[0].length || grid[nx][ny] == 0 || visited[nx][ny]) {
                continue;
            }
            size = dfs(grid, nx, ny, visited, size + 1);
        }
        return size;
    }
}
