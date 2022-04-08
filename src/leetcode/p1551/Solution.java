package leetcode.p1551;

public class Solution {
    public int minOperations(int n) {
        int result = 0;
        int totalAvg = 0;

        for (int i = 0; i < n; i++) {
            totalAvg += (i * 2) + 1;
        }
        totalAvg = totalAvg / n;

        for (int i = 0; i < n / 2; i++) {
            result += totalAvg - ((i * 2) + 1);
        }
        return result;
    }
}
