package programmers.p12902;

public class Solution {
    public int solution(int n) {
        if (n % 2 == 1) {
            return 0;
        }
        long[] arr = new long[n + 1];
        arr[2] = 3;
        arr[4] = 11;

        long sum = 0L;
        for (int i = 4; i <= n; i = i + 2) {
            arr[i] = (arr[i - 2] * 3 + 2 + (sum += arr[i - 4] * 2)) % 1000000007;
        }
        return (int) arr[n];
    }
}
