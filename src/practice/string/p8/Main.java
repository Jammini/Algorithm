package practice.string.p8;

import java.util.Scanner;

public class Main {
    public String solution(String word) {
        String answer = "NO";

        word = word.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(word).reverse().toString();

        if (word.equals(tmp)) {
            answer = "YES";
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