package leetcode.p150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack();

        for (String token : tokens) {
            if ("+".equals(token)) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b + a));
            } else if ("/".equals(token)) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b / a));
            } else if ("*".equals(token)) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b * a));
            } else if ("-".equals(token)) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b - a));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
