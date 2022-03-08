package leetcode.p2011.java;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(0) == '+' || operations[i].charAt(2) == '+') {
                answer++;
            } else {
                answer--;
            }
        }
        return answer;
    }
}
