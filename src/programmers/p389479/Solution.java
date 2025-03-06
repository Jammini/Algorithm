package programmers.p389479;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int solution(int[] players, int m, int k) {
        int answer = 0; // 증설 횟수
        int serverCnt = 0; // 현재 서버 개수
        Queue<Point> queue = new LinkedList<>();

        for (int player : players) {
            Iterator<Point> iterator = queue.iterator();
            while (iterator.hasNext()) {
                Point point = iterator.next();
                point.end--;
                if (point.end == 0) {
                    iterator.remove();
                    serverCnt -= point.server;
                }
            }

            if (player >= serverCnt * m + m) {
                int server = Math.abs(serverCnt - (player / m));
                serverCnt += server;
                answer += server;
                queue.add(new Point(server, k));
            }
        }
        return answer;
    }

    class Point {

        int server;
        int end;

        public Point(int server, int end) {
            this.server = server;
            this.end = end;
        }
    }
}
