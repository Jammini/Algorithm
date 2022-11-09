package practice.dfs.p13;

import java.util.Scanner;

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;
    static int n;
    static int answer = 0;

    public void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    dfs(i, j);
                }
            }
        }
    }

    public void dfs(int row, int column) {
        board[row][column] = 0;
        for (int i = 0; i < dx.length; i++) {
            int x = row + dx[i];
            int y = column + dy[i];
            if (x >= 0 && x < n && y >= 0 && y < n && board[x][y] == 1) {
                board[x][y] = 0;
                dfs(x, y);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        T.solution();
        System.out.println(answer);
    }
}
