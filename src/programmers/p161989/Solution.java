package programmers.p161989;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = section[0];
        for (int s : section) {
            if (s >= paint) {
                paint = s + m;
                answer++;
            }
        }
        return answer;
    }
}
