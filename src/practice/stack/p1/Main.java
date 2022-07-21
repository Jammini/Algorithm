package practice.stack.p1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String words) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        if (words.length() % 2 == 1) {
            return "NO";
        }

        for (char x : words.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine(); // (()(()))(()
        System.out.println(T.solution(input1));
    }
}
