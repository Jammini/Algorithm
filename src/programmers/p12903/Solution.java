package programmers.p12903;

public class Solution {
    public String solution(String s) {
        String answer = "";
        int center = s.length() / 2;

        if(s.length() % 2 == 1){
            answer = s.substring(center, center + 1);
        } else {
            answer = s.substring(center - 1, center + 1);
        }
        return answer;
    }
}
