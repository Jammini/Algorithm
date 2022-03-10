package leetcode.p1689.java;

public class Solution {
    public int minPartitions(String n) {
        int answer = 0;
        for (int i = 0; i < n.length(); i++) {
            if (answer < n.charAt(i) - '0') {
                answer = n.charAt(i) - '0';
            }
        }
        return answer;
    }
}
