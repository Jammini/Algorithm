package leetcode.p388;

import java.util.Stack;

public class Solution {
    public int lengthLongestPath(String input) {
        String[] folders = input.split("\n");
        Stack<String> stack = new Stack<>();

        int answer = 0;
        for (String folder : folders) {
            if (folder.length() >= 4 && folder.startsWith("    ")) {
                folder = "\t" + folder.substring(4);
            }
            String[] tab = folder.split("\t");
            int depth = tab.length - 1;
            String tabStr = tab[depth];

            if (!tabStr.contains(".")) {
                if (stack.isEmpty() || stack.size() <= depth) {
                    stack.push(tabStr);
                } else {
                    while (!stack.isEmpty() && depth < stack.size()) {
                        stack.pop();
                    }
                    stack.push(tabStr);
                }
            } else {
                while (!stack.isEmpty() && depth < stack.size()) {
                    stack.pop();
                }
                int length = 0;
                for (String s : stack) {
                    length += s.length() + 1;
                }
                length += tabStr.length();
                answer = Math.max(answer, length);
            }
        }
        return answer;
    }
}
