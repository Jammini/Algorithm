package programmers.p12985;

public class Solution {
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while (b % 2 != 0 || a + 1 != b ) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
        return answer;
    }
}
