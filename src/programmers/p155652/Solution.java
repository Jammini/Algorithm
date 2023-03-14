package programmers.p155652;

public class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            int count = 1;
            while (count <= index) {
                if (++c > 'z') {
                    c -= 26;
                }
                if (skip.indexOf(c) == -1) {
                    count++;
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }
}
