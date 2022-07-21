package practice.stack.p4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String word) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : word.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int calc = 0;
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (x) {
                    case '*':
                        calc = num2 * num1;
                        break;
                    case '+':
                        calc = num2 + num1;
                        break;
                    case '-':
                        calc = num2 - num1;
                        break;
                    case '/':
                        calc = num2 / num1;
                        break;
                }
                stack.push(calc);
            }
        }
        return answer = stack.pop();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine(); // 352+*9-
        System.out.println(T.solution(input1));
    }
}
