package programmers.p133502;

import java.util.Stack;

public class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            System.out.println(stack);
            if (i == 1 && stack.size() >= 3) {
                int num3 = stack.pop();
                int num2 = stack.pop();
                int num1 = stack.pop();

                if (num3 == 3 && num2 == 2 && num1 == 1) {
                    answer++;
                } else {
                    stack.push(num1);
                    stack.push(num2);
                    stack.push(num3);
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }
        return answer;
    }
}
