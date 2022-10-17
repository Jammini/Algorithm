package programmers.p92335;

public class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] notation = Integer.toString(n, k).split("0");
        for (String str : notation) {
            if (!"".equals(str) && isPrime(str)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean isPrime(String decimal) {
        long dec = Long.parseLong(decimal);
        if (dec == 1) {
            return false;
        }
        boolean flag = true;
        for (long i = 2; i * i <= dec; i++) {
            if (dec % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
