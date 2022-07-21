package practice.stack.p5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String word) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '(') {
                stack.push(word.charAt(i));
            } else {
                stack.pop();
                if (word.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine(); // ()(((()())(())()))(())
        System.out.println(T.solution(input1));
    }
}
