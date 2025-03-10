package programmers.p169199;

import java.util.*;

public class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(String[] board) {
        int answer = -1;
        int count = 0;
        String[][] arr = new String[board.length][board[0].length()];
        boolean[][] visit = new boolean[board.length][board[0].length()];
        Queue<Point> queue = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            String[] str = board[i].split("");
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = str[j];
                if(arr[i][j].equals("R")) {
                    visit[i][j] = true;
                    queue.offer(new Point(i, j));
                }
            }
        }

        label:
        while(!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Point p = queue.poll();

                for(int j = 0; j < 4; j++) {
                    int px = p.x + dx[j];
                    int py = p.y + dy[j];
                    while(px >= 0 && px < arr.length && py >= 0 && py < arr[0].length && !arr[px][py].equals("D")) {
                        px = px + dx[j];
                        py = py + dy[j];
                    }
                    px = px - dx[j];
                    py = py - dy[j];
                    if (!visit[px][py]) {
                        visit[px][py] = true;
                        queue.offer(new Point(px, py));
                    }
                    if(arr[px][py].equals("G")) {
                        answer = count;
                        break label;
                    }
                }
            }
        }
        return answer;
    }
}
