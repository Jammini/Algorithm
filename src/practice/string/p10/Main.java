package practice.string.p10;

import java.util.Scanner;

public class Main {
    public int[] solution(String word, char x) {
        char[] answer = word.toCharArray();
        int[] digit = new int[answer.length];
        int p = 1000;

        for (int i = 0; i < word.length(); i++) {
            if (answer[i] == x) {
                digit[i] = 0;
                p = 0;
            } else {
                digit[i] = ++p;
            }
        }
        p = 1000;
        for (int i = digit.length - 1; i >= 0; i--) {
            if (answer[i] == x) {
                p = 0;
            } else {
                if (digit[i] > ++p) {
                    digit[i] = p;
                }
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char x = in.next().charAt(0);
        for (int a : T.solution(word, x)) {
            System.out.print(a + " ");
        }
    }
}