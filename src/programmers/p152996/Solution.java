package programmers.p152996;

import java.util.*;

public class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        for (int i = 0; i < weights.length; i++) {
            for (int j = i + 1; j < weights.length; j++) {
                if (weights[i] * 4 < weights[j]) {
                    break;
                }
                if (weights[i] == weights[j] || weights[i] * 3 == weights[j] * 2 || weights[i] * 4 == weights[j] * 2 || weights[i] * 4 == weights[j] * 3) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
