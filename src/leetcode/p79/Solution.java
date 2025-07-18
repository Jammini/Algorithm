package leetcode.p79;

public class Solution {
    int[] x = {-1, 0, 1, 0};
    int[] y = {0, 1, 0, -1};
    boolean flag = false;
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] w = word.toCharArray();

        if(w.length == 1) {
            for (char[] chars : board) {
                for (int j = 0; j < board[0].length; j++) {
                    if (chars[j] == w[0]) {
                        return true;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, w, visited, i, j, 0);
            }
        }
        return flag;
    }
    public void dfs(char[][] board, char[] word, boolean[][] visited, int i, int j, int level) {
        if(level == word.length) {
            flag = true;
            return;
        }

        for(int k = 0; k < 4; k++) {
            if((i + x[k]) >= 0 && (i + x[k]) < board.length && (j + y[k]) >= 0 && (j + y[k]) < board[0].length && !visited[i + x[k]][j + y[k]] && word[level] == board[i + x[k]][j + y[k]]) {
                visited[i + x[k]][j + y[k]] = true;
                dfs(board, word, visited, (i + x[k]), (j + y[k]), (level + 1));
                visited[i + x[k]][j + y[k]] = false;
            }
        }
    }
}
