package programmers.p140108;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        int xCnt = 0;
        char x = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (x == s.charAt(i)) {
                xCnt++;
            } else {
                xCnt--;
            }
            if (xCnt == 0) {
                answer++;
                xCnt = 0;
                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
            }
        }
        if (xCnt != 0) {
            answer++;
        }
        return answer;
    }
}
