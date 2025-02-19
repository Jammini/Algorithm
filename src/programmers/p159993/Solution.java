package programmers.p159993;

import java.util.LinkedList;
import java.util.Queue;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(String[] maps) {
        int answer = 0;
        char[][] board = new char[maps.length][maps[0].length()];
        Queue<Point> q = new LinkedList();
        boolean[][] lVisited = new boolean[maps.length][maps[0].length()];
        boolean[][] EVisited = new boolean[maps.length][maps[0].length()];

        // board 초기화
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                board[i][j] = maps[i].charAt(j);
                if (maps[i].charAt(j) == 'S') {
                    q.offer(new Point(i, j));
                }
            }
        }

        // 레버 찾기
        label:
        while (!q.isEmpty()) {
            int size = q.size();
            answer++;
            for (int k = 0; k < size; k++) {
                Point tmp = q.poll();
                for (int i = 0; i < dx.length; i++) {
                    if (tmp.x + dx[i] >= 0 && tmp.x + dx[i] < maps.length &&
                            tmp.y + dy[i] >= 0 && tmp.y + dy[i] < maps[0].length() &&
                            !lVisited[tmp.x + dx[i]][tmp.y + dy[i]] &&
                            board[tmp.x + dx[i]][tmp.y + dy[i]] != 'X') {
                        if (board[tmp.x + dx[i]][tmp.y + dy[i]] == 'L') {
                            q.clear();
                            q.offer(new Point(tmp.x + dx[i], tmp.y + dy[i]));
                            break label;
                        }
                        lVisited[tmp.x + dx[i]][tmp.y + dy[i]] = true;
                        q.offer(new Point(tmp.x + dx[i], tmp.y + dy[i]));
                    }
                }
            }
        }
        // 레버에 도달하지 못하면 -1 반환
        if (q.isEmpty()) {
            return -1;
        }

        // 출구 찾기
        while (!q.isEmpty()) {
            int size = q.size();
            answer++;
            for (int k = 0; k < size; k++) {
                Point tmp = q.poll();
                for (int i = 0; i < dx.length; i++) {
                    if (tmp.x + dx[i] >= 0 && tmp.x + dx[i] < maps.length &&
                            tmp.y + dy[i] >= 0 && tmp.y + dy[i] < maps[0].length() &&
                            !EVisited[tmp.x + dx[i]][tmp.y + dy[i]] &&
                            board[tmp.x + dx[i]][tmp.y + dy[i]] != 'X') {
                        if (board[tmp.x + dx[i]][tmp.y + dy[i]] == 'E') {
                            return answer;
                        }
                        EVisited[tmp.x + dx[i]][tmp.y + dy[i]] = true;
                        q.offer(new Point(tmp.x + dx[i], tmp.y + dy[i]));
                    }
                }
            }
        }
        return -1;
    }
}
