package programmers.p12973;

import java.util.Stack;

public class Solution {
    public int solution(String s) {
        int answer = -1;
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}
