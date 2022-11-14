package programmers.p68936;

public class Solution {
    int[][] arrTmp;

    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        arrTmp = new int[arr.length][arr.length];

        copyArr(arr);
        int index = arr.length;
        while (index > 1) {
            for (int i = 0; i < arr.length; i += index) {
                for (int j = 0; j < arr.length; j += index) {
                    isPrime(i, j, index);
                }
            }
            index = index / 2;
        }
        for (int[] ints : arrTmp) {
            for (int j = 0; j < arrTmp.length; j++) {
                if (ints[j] == 0) {
                    answer[0]++;
                } else if (ints[j] == 1) {
                    answer[1]++;
                }
            }
        }
        return answer;
    }

    private void isPrime(int x, int y, int index) {
        int num = arrTmp[x][y];
        boolean flag = true;
        label:
        for (int i = x; i < x + index; i++) {
            for (int j = y; j < y + index; j++) {
                if (num != arrTmp[i][j]) {
                    flag = false;
                    break label;
                }
            }
        }

        if (flag) {
            for (int i = x; i < x + index; i++) {
                for (int j = y; j < y + index; j++) {
                    arrTmp[i][j] = -1;
                }
            }
        }
        arrTmp[x][y] = num;
    }

    private void copyArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, arrTmp[i], 0, arr.length);
        }
    }
}
