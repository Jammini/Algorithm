package leetcode.p1190;

public class Solution {
    private int index = 0;

    public String reverseParentheses(String s) {
        return helper(s).toString();
    }

    private StringBuilder helper(String s) {
        StringBuilder current = new StringBuilder();

        while (index < s.length()) {
            char c = s.charAt(index++);

            if (c == '(') {
                StringBuilder inner = helper(s);
                current.append(inner);
            } else if (c == ')') {
                return current.reverse();
            } else {
                current.append(c);
            }
        }
        return current;
    }
}
