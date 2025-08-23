package leetcode.p1905;

public class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int answer = 0;
        for(int i = 0; i < grid2.length; i++) {
            for(int j = 0; j < grid2[0].length; j++) {
                if(grid2[i][j] == 1) {
                    grid2[i][j] = 0;
                    boolean flag = dfs(grid1, grid2, i, j);
                    if(flag) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean dfs(int[][] grid1, int[][] grid2, int i, int j) {
        boolean flag = true;
        if(grid1[i][j] == 0) {
            flag = false;
        }

        for(int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];

            if(x >= 0 && x < grid2.length && y >= 0 && y < grid2[0].length && grid2[x][y] == 1) {
                grid2[x][y] = 0;
                if(!dfs(grid1, grid2, x, y)) {
                    flag = false;
                }
            }
        }
        return flag;
    }
}
