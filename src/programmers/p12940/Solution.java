package programmers.p12940;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGdc(n, m);
        answer[1] = getLcm(n, m, answer[0]);
        return answer;
    }

    /**
     * 최소 공배수
     */
    private int getLcm(int n, int m, int gcm) {
        return n * m / gcm;
    }

    /**
     * 최대 공약수
     */
    private int getGdc(int n, int m) {
        int answer = 0;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                answer = i;
            }
        }
        return answer;
    }
}
