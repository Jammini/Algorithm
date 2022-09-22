package programmers.p42842;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        int width = 0;
        int height = 0;

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0 && total == (yellow / i + 2) * (i + 2)) {
                width = i + 2;
                height = yellow / i + 2;
            }
        }
        answer[0] = width;
        answer[1] = height;
        return answer;
    }
}
