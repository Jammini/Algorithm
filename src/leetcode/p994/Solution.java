package leetcode.p994;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Point(i, j));
                    answer = -1;
                }
            }
        }

        while (!queue.isEmpty()) {
            answer++;
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                Point point = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int px = point.x + dx[i];
                    int py = point.y + dy[i];

                    if (px >= 0 && px < grid.length && py >= 0 && py < grid[0].length) {
                        if (grid[px][py] == 1) {
                            grid[px][py] = 2;
                            queue.offer(new Point(px, py));
                        }
                    }
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return answer;
    }
}
