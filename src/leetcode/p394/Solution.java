package leetcode.p394;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        StringBuilder num = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { // 숫자일 경우
                num.append(c);
            } else if (c == ']') { // '[' 가 나올때까지 문자열을 가지고 있다 숫자 만큼 더하여 스택에 넣어준다.
                StringBuilder sb = new StringBuilder();
                while (!"[".equals(stringStack.peek())) {
                    sb.insert(0, stringStack.pop());
                }
                stringStack.pop();
                StringBuilder result = new StringBuilder();
                int n = integerStack.pop();
                for (int i = 0; i < n; i++) {
                    result.append(sb);
                }
                stringStack.push(String.valueOf(result));
            } else if (c == '[') {
                stringStack.push("[");
                integerStack.push(Integer.parseInt(num.toString()));
                num = new StringBuilder();
            } else {
                stringStack.push(String.valueOf(c));
            }
        }

        StringBuilder answer = new StringBuilder();
        for (String s1 : stringStack) {
            answer.append(s1);
        }
        return answer.toString();
    }
}
