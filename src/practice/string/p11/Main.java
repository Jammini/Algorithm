package practice.string.p11;

import java.util.Scanner;

public class Main {
    public String solution(String word) {
        StringBuilder answer = new StringBuilder();
        int count = 1;
        word = word + " ";
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                answer.append(word.charAt(i));
                if (count > 1) {
                    answer.append(count);
                }
                count = 1;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.print(T.solution(word));
    }
}