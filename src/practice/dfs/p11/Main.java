package practice.dfs.p11;

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
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m;
    static int answer = Integer.MIN_VALUE;

    public void bfs() {
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < dx.length; i++) {
                if (tmp.x + dx[i] >= 0 && tmp.x + dx[i] < m && tmp.y + dy[i] >= 0 && tmp.y + dy[i] < n && board[tmp.x + dx[i]][tmp.y + dy[i]] == 0) {
                    board[tmp.x + dx[i]][tmp.y + dy[i]] = 1;
                    queue.offer(new Point(tmp.x + dx[i], tmp.y + dy[i]));
                    dis[tmp.x + dx[i]][tmp.y + dy[i]] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }

        boolean flag = true;
        label:
        for (int i = 0; i < dis.length; i++) {
            for (int j = 0; j < dis[0].length; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                    break label;
                }
            }
        }


        if (!flag) {
            answer = -1;
            return;
        }
        for (int[] di : dis) {
            for (int j = 0; j < dis[0].length; j++) {
                answer = Math.max(answer, di[j]);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        board = new int[m][n];
        dis = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        T.bfs();
        System.out.println(answer);
    }
}
