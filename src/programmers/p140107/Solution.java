package programmers.p140107;

public class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        for (long i = 0; i <= d; i = i + k) {
            answer += (long) Math.sqrt(((long) d * d) - (i * i)) / k + 1;
        }
        return answer;
    }
}
