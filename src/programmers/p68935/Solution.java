package programmers.p68935;

public class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 3);
            n = n / 3;
        }
        return Integer.valueOf(sb.toString(), 3);
    }
}
