package programmers.p68645;

public class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            index += i;
        }
        int[] answer = new int[index];

        int x = -1;
        int y = 0;
        int num = 1;
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                arr[++x][y] = num++;
            }
            n--;
            for (int i = 0; i < n; i++) {
                arr[x][++y] = num++;
            }
            n--;
            for (int i = 0; i < n; i++) {
                arr[--x][--y] = num++;
            }
            n--;
        }

        int idx = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] != 0) {
                    answer[idx++] = ints[j];
                }
            }
        }
        return answer;
    }
}
