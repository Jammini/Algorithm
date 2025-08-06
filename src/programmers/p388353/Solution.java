package programmers.p388353;

public class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    int n, m;
    char[][] map;
    boolean[][] visited;

    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        n = storage.length;
        m = storage[0].length();
        map = new char[n][m];
        
        // 2차원 배열로 변환
        for (int i = 0; i < n; i++) {
            map[i] = storage[i].toCharArray();
        }

        for (String request : requests) {
            if (request.length() == 1) { // 지게차
                useFork(request.charAt(0));
            } else { // 크레인
                useCrane(request.charAt(0));
            }
        }

        // 남아있는 물건의 개수 세기
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] != '0') {
                    answer++;
                }
            }
        }
        return answer;
    }

    public void useCrane(char target) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == target) {
                    map[i][j] = '0';
                }
            }
        }
    }


    public void useFork(char target) {
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            if (!visited[i][0]) {
                dfs(i, 0, target);
            }
            if (!visited[i][m - 1]) {
                dfs(i, m - 1, target);
            }
        }
        for (int i = 0; i < m; i++) {
            if (!visited[0][i]) {
                dfs(0, i, target);
            }
            if (!visited[n - 1][i]) {
                dfs(n - 1, i, target);
            }
        }
    }

    public void dfs(int x, int y, char target) {
        visited[x][y] = true;
        if (map[x][y] == '0') {
            for (int i = 0; i < 4; i++) {
                int lx = x + dx[i];
                int ly = y + dy[i];
                if (lx < 0 || ly < 0 || lx >= n || ly >= m) {
                    continue;
                }
                if (!visited[lx][ly]) {
                    dfs(lx, ly, target);
                }
            }
        }
        if (map[x][y] == target) {
            map[x][y] = '0';
        }
    }
}
