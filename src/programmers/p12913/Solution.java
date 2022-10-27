package programmers.p12913;

public class Solution {
    /*int answer = 0;
    int solution(int[][] land) {
        int sum = 0;
        calculator(land, 0, -1, sum);
        return answer;
    }

    private void calculator(int[][] land, int L, int x, int sum) {
        if (L == land.length) {
            answer = Math.max(answer, sum);
            return;
        }
        for (int i = 0; i < land[L].length; i++) {
            if (x != i) {
                calculator(land, L + 1, i, sum + land[L][i]);
            }
        }
        return;
    }*/
    int solution(int[][] land) {
        int answer = 0;

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < land[0].length; k++) {
                    if (j != k) {
                        sum = Math.max(sum, land[i][j] + land[i - 1][k]);
                    }
                }
                land[i][j] = sum;
            }
        }

        for (int i = 0; i < land[0].length; i++) {
            answer = Math.max(answer, land[land.length - 1][i]);
        }
        return answer;
    }
}

