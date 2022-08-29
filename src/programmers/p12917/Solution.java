package programmers.p12917;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        char[] answer = s.toCharArray();
        Arrays.sort(answer);
        StringBuilder sb = new StringBuilder(String.valueOf(answer));
        return sb.reverse().toString();
    }
}
