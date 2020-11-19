package programmers.P12899;

class Solution {
    public String solution(int n) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            if (n % 3 == 1) {
                sb.insert(0, 1);
            } else if (n % 3 == 2) {
                sb.insert(0, 2);
            } else if (n % 3 == 0) {
                sb.insert(0, 4);
            }
            if (n - 3 == 0) {
                break;
            }
            n = (n - 1) / 3;
        }
        answer = sb.toString();

        return answer;
    }
}