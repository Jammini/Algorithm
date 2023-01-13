package programmers.p135808;

import java.util.Arrays;

public class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        int index = score.length - 1;
        for (int i = 0; i < score.length / m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                min = Math.min(min, score[index--]);
            }
            answer += min * m;
        }
        return answer;
    }
}
