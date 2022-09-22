package programmers.p12911;

public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        int bitCount = Integer.bitCount(n);
        while (true) {
            int nextBitCnt = Integer.bitCount(++n);
            if (nextBitCnt == bitCount) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}

