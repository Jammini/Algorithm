package programmers.p12900;

public class Solution {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1000000007;
        }
        return arr[n];
    }
}
