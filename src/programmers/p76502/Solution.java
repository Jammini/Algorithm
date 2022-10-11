package programmers.p76502;

import java.util.*;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            queue.offer(c);
        }

        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (verification(s)) {
                answer++;
            }
            s = s.substring(1) + queue.poll();
        }
        return answer;
    }

    public boolean verification(String s) {
        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                } else if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
