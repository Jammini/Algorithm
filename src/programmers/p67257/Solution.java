package programmers.p67257;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    boolean[] flag = new boolean[3];
    long answer = Long.MIN_VALUE;
    String word;

    public long solution(String expression) {
        char[] ep = {'*', '+', '-'};
        word = expression;
        rankSign(ep, "");
        return answer;
    }

    private void rankSign(char[] ep, String sign) {
        if (flag[0] && flag[1] && flag[2]) {
            answer = Math.max(answer, Math.abs(calculation(word, sign)));
            return;
        }

        for (int i = 0; i < ep.length; i++) {
            if (!flag[i]) {
                flag[i] = true;
                rankSign(ep, sign + ep[i]);
                flag[i] = false;
            }
        }
    }

    public Long calculation(String expression, String sign) {
        List<String> numList = new ArrayList<>();
        List<Character> signList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (!Character.isDigit(c)) {
                numList.add(sb.toString());
                sb = new StringBuilder();
                signList.add(c);
            } else {
                sb.append(c);
            }
        }
        numList.add(sb.toString());
        for (char c : sign.toCharArray()) {
            while (signList.contains(c)) {
                for (int j = 0; j < signList.size(); j++) {
                    if (signList.get(j) == c) {
                        Long result = 0L;
                        switch (c) {
                            case '*':
                                result = Long.parseLong(numList.get(j)) * Long.parseLong(numList.get(j + 1));
                                break;
                            case '+':
                                result = Long.parseLong(numList.get(j)) + Long.parseLong(numList.get(j + 1));
                                break;
                            case '-':
                                result = Long.parseLong(numList.get(j)) - Long.parseLong(numList.get(j + 1));
                                break;
                        }
                        numList.remove(j + 1);
                        numList.remove(j);
                        signList.remove(j);
                        numList.add(j, String.valueOf(result));
                        break;
                    }
                }
            }
        }
        return Long.valueOf(numList.get(0));
    }
}
