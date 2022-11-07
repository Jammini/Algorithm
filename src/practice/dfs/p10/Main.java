package practice.dfs.p10;

import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < dx.length; i++) {
                if (x + dx[i] >= 1 && x + dx[i] <= 7 && y + dy[i] >= 1 && y + dy[i] <= 7 && board[x + dx[i]][y + dy[i]] == 0) {
                    board[x + dx[i]][y + dy[i]] = 1;
                    dfs(x + dx[i], y + dy[i]);
                    board[x + dx[i]][y + dy[i]] = 0;
                }
            }

        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        board[1][1] = 1;
        T.dfs(1, 1);
        System.out.println(answer);
    }
}
