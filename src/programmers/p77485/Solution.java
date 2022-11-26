package programmers.p77485;

public class Solution {

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] arr = new int[rows + 1][columns + 1];
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                arr[i][j] = num++;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotateBorder(arr, queries[i]);
        }

        return answer;
    }

    private int rotateBorder(int[][] arr, int[] query) {
        int x1 = query[0];
        int y1 = query[1];
        int x2 = query[2];
        int y2 = query[3];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[] rotate = {y2 - y1, x2 - x1, y2 - y1, x2 - x1};
        int x = arr[x1][y1];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < dx.length; i++) {
            for (int j = 0; j < rotate[i]; j++) {
                x1 = x1 + dx[i];
                y1 = y1 + dy[i];
                int tmp = arr[x1][y1];
                arr[x1][y1] = x;
                x = tmp;
                min = Math.min(min, arr[x1][y1]);
            }
        }
        return min;
    }
}
