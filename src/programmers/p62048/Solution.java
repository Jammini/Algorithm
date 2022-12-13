package programmers.p62048;

class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        int gcd = getGcd(w, h);
        long x = w / gcd;
        long y = h / gcd;
        answer = (long) w * h - ((x + y - 1) * gcd);
        return answer;
    }

    private int getGcd(int w, int h) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(w, h); i++) {
            if (w % i == 0 && h % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}