package programmers.p12936;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            list.add(i);
        }
        k--;

        int index = 0;
        while (n > 0) {
            long divide = factorial / n;
            int num = (int) (k / divide);
            answer[index++] = list.get(num);
            list.remove(num);
            factorial /= n;
            k = k % divide;
            n--;
        }
        return answer;
    }
}
