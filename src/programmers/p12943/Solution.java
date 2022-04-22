package programmers.p12943;

public class Solution {
    public int solution(int num) {
        int answer = -1;
        int count = 0;
        while (count < 500) {
            if (num == 1) {
                answer = count;
                break;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            } else {
                num /= 2;
            }
            count++;
        }
        return answer;
    }
}
