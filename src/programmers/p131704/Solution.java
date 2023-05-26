package programmers.p131704;

import java.util.Stack;

public class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();

        int index = 0;
        for (int i = 1; i <= order.length; i++) {
            stack.push(i);
            while (stack.isEmpty() == false && order[index] == stack.peek()) {
                stack.pop();
                index++;
            }
        }
        return index;
    }
}
