package practice.stack.p2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String word) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : word.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                stack.pop();
            } else if (stack.isEmpty()){
                answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine(); // (A(BC)D)EF(G(H)(IJ)K)LM(N) EFLM
        System.out.println(T.solution(input1));
    }
}
