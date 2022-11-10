package programmers.p42746;

import java.util.Arrays;
import java.util.Comparator;

/*int answer = Integer.MIN_VALUE;
    boolean[] flag;
    public String solution(int[] numbers) {
        flag = new boolean[numbers.length];
        dfs(0, numbers, "");
        return String.valueOf(answer);
    }

    public void dfs(int L, int[] number, String sum) {
        if (L == number.length) {
            answer = Math.max(answer, Integer.parseInt(sum));
            return;
        } else {
            for (int i = 0; i < number.length; i++) {
                if (flag[i]) {
                    continue;
                }
                flag[i] = true;
                dfs(L + 1, number, sum + number[i]);
                flag[i] = false;
            }
        }
    }
}*/
public class Solution {
    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : num) {
            sb.insert(0, s);
        }
        if (sb.toString().charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}
