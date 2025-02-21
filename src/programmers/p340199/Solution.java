package programmers.p340199;

public class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while(min(wallet[0], wallet[1]) < min(bill[0], bill[1]) || max(wallet[0], wallet[1]) < max(bill[0], bill[1])) {
            answer++;
            int tmp = max(bill[0], bill[1]) / 2;

            if(bill[0] > bill[1]) {
                bill[0] = tmp;
            } else {
                bill[1] = tmp;
            }
        }
        return answer;
    }
    
    public int max(int a, int b) {
        return Math.max(a, b);
    }
    
    public int min(int a, int b) {
        return Math.min(a, b);
    }
}
