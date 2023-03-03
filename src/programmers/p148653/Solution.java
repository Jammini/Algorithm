package programmers.p148653;

public class Solution {
    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int n = storey % 10;
            if (n > 5 || (n == 5 && (storey / 10) % 10 >= 5)) {
                n = 10 - n;
                storey += 10;
            }
            answer += n;
            storey /= 10;
        }
        return answer;
    }
}
