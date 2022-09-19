package programmers.p70129;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int round = 0;
        int zeroCut = 0;

        while (!"1".equals(s)) {
            round++;
            int length = s.length();
            s = s.replace("0", "");
            zeroCut += length - s.length();
            s = Integer.toBinaryString(s.length());
        }
        answer[0] = round;
        answer[1] = zeroCut;

        return answer;
    }
}
