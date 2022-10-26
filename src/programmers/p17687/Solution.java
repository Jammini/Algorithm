package programmers.p17687;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        int num = 0;
        int index = 0;
        p = p==m ? 0 : p;

        label:
        while (true) {
            String str = Integer.toString(num++, n);
            for (char c : str.toCharArray()) {
                if (t <= 0) {
                    break label;
                }
                if (!Character.isDigit(c)) {
                    c = Character.toUpperCase(c);
                }
                if (++index % m == p) {
                    answer.append(c);
                    t--;
                }
            }
        }
        return answer.toString();
    }
}