package practice.dfs.p14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;
    static int n;
    static int answer = 0;
    Queue<Point> queue = new LinkedList<>();

    public void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    queue.offer(new Point(i, j));
                    bfs();
                }
            }
        }
    }

    public void bfs() {
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < dx.length; i++) {
                int x = tmp.x + dx[i];
                int y = tmp.y + dy[i];
                if (x >= 0 && x < n && y >= 0 && y < n && board[x][y] == 1) {
                    board[x][y] = 0;
                    queue.offer(new Point(x, y));
                }
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
