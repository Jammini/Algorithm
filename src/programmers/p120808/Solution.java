package programmers.p120808;

public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int molecule = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;
        int gdc = getGdc(molecule, denominator);

        answer[0] = molecule / gdc;
        answer[1] = denominator / gdc;
        return answer;
    }
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
