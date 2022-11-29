package programmers.p134240;

public class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        answer.append("0");

        for (int i = food.length - 1; i >= 0; i--) {
            int count = food[i] / 2;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
            answer.append(sb);
            answer.insert(0, sb);
        }
        return answer.toString();
    }
}
