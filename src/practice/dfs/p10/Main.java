package practice.dfs.p10;

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
    static int answer = 0;

    public void dfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        board[x][y] = 1;
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < dx.length; i++) {
                if (tmp.x + dx[i] >= 1 && tmp.x + dx[i] <= 7 && tmp.y + dy[i] >= 1 && tmp.y + dy[i] <= 7 && board[tmp.x + dx[i]][tmp.y + dy[i]] == 0) {
                    board[tmp.x + dx[i]][tmp.y + dy[i]] = 1;
                    queue.offer(new Point(tmp.x + dx[i], tmp.y + dy[i]));
                    dis[tmp.x + dx[i]][tmp.y + dy[i]] = dis[tmp.x][tmp.y] + 1;
                }
                answer++;
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        board[1][1] = 1;
        T.dfs(1, 1);
        if (dis[7][7] == 0) {
            answer = -1;
        } else {
            answer = dis[7][7];
        }
        System.out.println(answer);
    }
}
