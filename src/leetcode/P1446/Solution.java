package leetcode.P1446;

public class Solution {
    public int maxPower(String s) {
        int answer = 1;
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                if (answer < count) {
                    answer = count;
                }
                count = 1;
            }
        }
        if (answer < count) {
            answer = count;
        }
        return answer;
    }

}
