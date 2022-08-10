package programmers.p12924;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int sum = 0;
        int lt = 1;
        int rt = 0;

        while (rt <= n) {
            if (sum == n) {
                answer++;
                sum -= lt++;
            } else if (sum > n) {
                sum -= lt++;
            } else {
                sum += ++rt;
            }
        }
        return answer;
    }
}
