package practice.dfs.p15;

import java.util.ArrayList;
import java.util.List;
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
    static int n, m, len;
    static int answer = Integer.MAX_VALUE;
    static int[] board;
    static List<Point> hs, pz;

    public void dfs(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int x : board) {
                    Point p = pz.get(x);
                    dis = Math.min(dis, Math.abs(h.x - p.x) + Math.abs(h.y - p.y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                board[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if (tmp == 1) hs.add(new Point(i, j));
                else if (tmp == 2) pz.add(new Point(i, j));
            }
        }
        len = pz.size();
        board = new int[m];
        T.dfs(0, 0);
        System.out.println(answer);
    }
}
