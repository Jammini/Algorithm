package programmers.p12911;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String binaryString = Integer.toBinaryString(n);
        int cnt = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                cnt++;
            }
        }
        boolean flag = true;
        while (flag) {
            n++;
            String tmpBinary = Integer.toBinaryString(n);
            int tmpCnt = 0;
            for (char c : tmpBinary.toCharArray()) {
                if (c == '1') {
                    tmpCnt++;
                }
            }
            if (tmpCnt == cnt) {
                flag = false;
            }
        }
        answer = n;
        return answer;
    }
}

