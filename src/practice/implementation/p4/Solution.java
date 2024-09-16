package practice.implementation.p4;

import java.util.*;

class Solution {
    public int[] solution(int c, int r, int k) {
        int[] answer = new int[2];
        boolean[][] visited = new boolean[c][r];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0;
        int y = 0;
        int cnt = 1;
        int location = 1;

        if (c * r < k) {
            return new int[]{0, 0};
        }

        while (cnt < k) {
            int nx = x + dx[location];
            int ny = y + dy[location];
            if (nx < 0 || nx >= c || ny < 0 || ny >= r || visited[nx][ny] == true) {
                location = (location + 1) % 4;
                continue;
            }
            cnt++;
            visited[x][y] = true;
            x = nx;
            y = ny;
        }
        answer[0] = x + 1;
        answer[1] = y + 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(6, 5, 12))); // [6,3]
        System.out.println(Arrays.toString(T.solution(6, 5, 20))); // [2,3]
        System.out.println(Arrays.toString(T.solution(6, 5, 30))); // [4,3]
        System.out.println(Arrays.toString(T.solution(6, 5, 31))); // [0,0]
    }
}