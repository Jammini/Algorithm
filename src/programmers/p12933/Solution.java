package programmers.p12933;

import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "" + n;
        int[] num = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            num[i] = s.charAt(i) - '0';
        }
        Arrays.sort(num);
        StringBuilder sb = new StringBuilder();
        for (int i : num) {
            sb.insert(0, i);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
