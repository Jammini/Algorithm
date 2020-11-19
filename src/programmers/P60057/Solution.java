package programmers.P60057;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(answer);

        answer = s.length();

        for (int i = s.length() / 2; i > 0; i--) {
            String tmp = s.substring(0, i);
            String end = s.substring(i * (s.length() / i), s.length());
            int cnt = -1;
            int cnt2 = 0;
            for (int j = 0; j < s.length() / i; j++) {
                String tmp2 = s.substring(i * j, i * j + i);
                if (tmp.equals(tmp2)) {
                    cnt++;
                    if (cnt >= 1) {
                        tmp2 = (cnt + 1) + tmp2;
                        int c = (sb.length() - cnt2);
                        if (c < 0) {
                            c = 0;
                        }
                        sb.delete(c, c + cnt2);
                    }
                } else {
                    cnt = 0;
                    tmp = tmp2;
                }
                sb.append(tmp2);
                cnt2 = tmp2.length();
            }
            sb.append(end);
            if (sb.length() < answer) {
                answer = sb.length();
            }
            sb.setLength(0);
        }
        return answer;
    }
}