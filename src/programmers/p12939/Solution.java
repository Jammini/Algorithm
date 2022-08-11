package programmers.p12939;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (String s1 : str) {
            int num = Integer.parseInt(s1);
            if (maxNum < num) {
                maxNum = num;
            }
            if (minNum > num) {
                minNum = num;
            }
        }
        answer = minNum + " " + maxNum;
        return answer;
    }
}
