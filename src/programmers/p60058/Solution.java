package programmers.p60058;

class Solution {
    public String solution(String p) {
        return divideBracket(p);
    }

    private String divideBracket(String p) {
        if ("".equals(p)) {
            return "";
        }
        int cnt = 0;
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();

        for (char c : p.toCharArray()) {
            if (c == '(') {
                cnt++;
            } else {
                cnt--;
            }
            u.append(c);

            if (cnt == 0) {
                v.append(p.substring(u.length()));
                if (verification(u)) {
                    u.append(solution(v.toString()));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(");
                    sb.append(divideBracket(v.toString()));
                    sb.append(")");
                    u.delete(u.length() - 1, u.length());
                    u.delete(0, 1);
                    sb.append(reverseString(u.toString()));
                    return sb.toString();
                }
                break;
            }
        }
        return u.toString();
    }

    private boolean verification(StringBuilder sb) {
        return sb.charAt(0) != ')';
    }

    private String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char s : str.toCharArray()) {
            if (s == '(') {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }
        return sb.toString();
    }
}