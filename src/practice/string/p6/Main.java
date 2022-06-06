package practice.string.p6;

import java.util.Scanner;

public class Main {
    public String solution(String word) {
        String answer = "";

        for (int i = 0; i < word.length(); i++) {
            if (i == word.indexOf(word.charAt(i))) {
                answer += word.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(T.solution(word));
    }
}
