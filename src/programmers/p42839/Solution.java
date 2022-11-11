package programmers.p42839;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Integer> set = new HashSet<>();
    boolean[] flag;
    String[] num;

    public int solution(String numbers) {
        int answer = 0;
        flag = new boolean[numbers.length()];
        num = numbers.split("");

        saveNumber("", 0);

        for (Integer integer : set) {
            if (findDecimals(integer)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean findDecimals(int n) {
        boolean answer = true;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    private void saveNumber(String sum, int L) {
        if (!"".equals(sum)) set.add(Integer.valueOf(sum));

        if (L > num.length) {
            return;
        }

        for (int i = 0; i < num.length; i++) {
            if (!flag[i]) {
                flag[i] = true;
                saveNumber(sum + num[i], L + 1);
                flag[i] = false;
            }
        }
    }
}
