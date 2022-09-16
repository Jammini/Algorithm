package programmers.p12951;

public class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s =  " " +s.toLowerCase();

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                answer.append(Character.toUpperCase(s.charAt(i)));
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}
