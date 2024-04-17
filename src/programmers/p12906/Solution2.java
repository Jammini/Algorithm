package programmers.p12906;

import java.util.*;

public class Solution2 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int num : arr) {
            if(stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        int[] answer = {stack.size()};
        for(int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
