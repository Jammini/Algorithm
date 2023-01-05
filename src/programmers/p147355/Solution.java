package programmers.p147355;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pNum = Long.parseLong(p);

        for (int i = 0; i + pLength <= t.length(); i++) {
            long num = Long.parseLong(t.substring(i, i + pLength));
            if (num <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}
