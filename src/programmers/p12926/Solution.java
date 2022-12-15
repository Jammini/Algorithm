package programmers.p12926;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(' ');
                continue;
            }
            char calc = (char) (c + n);
            if (Character.isLowerCase(c) && calc > 'z') {
                c = (char) (calc - 26);
                answer.append(c);
                continue;
            }
            if (Character.isUpperCase(c) && (char) (c + n) > 'Z') {
                c = (char) (calc - 26);
                answer.append(c);
                continue;
            }
            answer.append(calc);
        }
        return answer.toString();
    }
}
