package practice.stack.p7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String word1, String word2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char x : word1.toCharArray()) {
            queue.add(x);
        }

        for (char x : word2.toCharArray()) {
            if (queue.contains(x)) {
                if (queue.peek() == x) {
                    queue.poll();
                } else {
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine(); // CBA
        String input2 = in.nextLine(); // CBDAGE
        System.out.println(T.solution(input1, input2));
    }
}
