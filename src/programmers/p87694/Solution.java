package programmers.p87694;

import java.util.*;

class Solution {
    int[][] map;
    boolean[][] visited;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        map = new int[101][101];
        visited = new boolean[101][101];
        int answer = 0;

        characterX *= 2;
        characterY *= 2;
        itemX *= 2;
        itemY *= 2;


        for (int i = 0; i < rectangle.length; i++) {
            // 직사각형 체크
            rectangleCheck(rectangle[i]);
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{characterX, characterY});
        visited[characterX][characterY] = true;

        while (!queue.isEmpty()) {
            answer++;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] q = queue.poll();
                int x = q[0];
                int y = q[1];
                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx < 0 || ny < 0 || nx >= 101 || ny >= 101) continue;
                    if (visited[nx][ny] || map[nx][ny] != 1) continue;
                    if (nx == itemX && ny == itemY) {
                        return answer / 2;
                    }
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
        return answer;
    }

    public void rectangleCheck(int[] r) {
        r[0] = r[0] * 2;
        r[1] = r[1] * 2;
        r[2] = r[2] * 2;
        r[3] = r[3] * 2;

        for (int x = r[0]; x <= r[2]; x++) {
            for (int y = r[1]; y <= r[3]; y++) {
                if (x == r[0] || x == r[2] || y == r[1] || y == r[3]) {
                    if (map[x][y] == -1) {
                        continue;
                    }
                    map[x][y] = 1;
                } else map[x][y] = -1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{1, 1, 7, 4}, {3, 2, 5, 5}, {4, 3, 6, 9}, {2, 6, 8, 8}}, 1, 3, 7, 8)); // 17
    }
}
