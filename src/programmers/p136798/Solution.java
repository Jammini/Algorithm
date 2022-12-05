package programmers.p136798;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisor = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            divisor[i] = saveDivisor(i);
        }

        for (int i = 1; i < divisor.length; i++) {
            if (divisor[i] > limit) {
                answer += power;
            } else {
                answer += divisor[i];
            }
        }
        return answer;
    }

    private int saveDivisor(int num) {
        int count = 1;
        for (int j = 1; j <= num / 2; j++) {
            if (num % j == 0) {
                count++;
            }
        }
        return count;
    }
}
