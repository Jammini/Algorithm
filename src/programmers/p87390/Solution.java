package programmers.p87390;

public class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int) (right - left + 1);
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int share = (int) (left / n);
            int remainder = (int) (left % n);
            answer[i] = Math.max(share, remainder) + 1;
            left++;
        }
        return answer;
    }
}
