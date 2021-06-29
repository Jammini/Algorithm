package programmers.p12930;

public class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(" ")) {
                index = 0;
                answer += s.substring(i, i + 1);
            } else if (index % 2 == 0) {
                answer += s.substring(i, i + 1).toUpperCase();
                index++;
            } else{
                answer += s.substring(i, i + 1).toLowerCase();
                index++;
            }
        }
        return answer;
    }
}
