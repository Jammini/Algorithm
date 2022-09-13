package programmers.p17682;

import java.util.Stack;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        String s = "";
        for (char c : dartResult.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == 'S') {
                    stack.push(Integer.parseInt(s));
                } else if (c == 'D') {
                    stack.push((int) Math.pow(Integer.parseInt(s), 2));
                } else if (c == 'T') {
                    stack.push((int) Math.pow(Integer.parseInt(s), 3));
                } else if (c == '*') {
                    if (!stack.isEmpty()) {
                        int pop1 = stack.pop();
                        if (!stack.isEmpty()) {
                            int pop2 = stack.pop();
                            stack.push(pop2 * 2);
                        }
                        stack.push(pop1 * 2);
                    }
                } else if (c == '#') {
                    if (!stack.isEmpty()) {
                        stack.push(stack.pop() * -1);
                    }
                }
                s = "";
            } else {
                s += c;
            }
        }
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }
}