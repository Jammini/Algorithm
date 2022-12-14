package programmers.p12982;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int x : d) {
            if (budget >= x) {
                budget -= x;
                answer++;
            }
        }
        return answer;
    }
}
