package programmers.p42584;

import java.util.Stack;

public class Solution {
    public int[] solution(int[] prices) {
        /*int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int index = 0;
            for (int j = i; j < prices.length; j++) {
                answer[i] = index++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        return answer;*/
        Stack<Integer> beginIdxs = new Stack<>();
        int i = 0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i = 1; i < prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                System.out.println(prices[beginIdxs.peek()]);
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }

        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }
}
