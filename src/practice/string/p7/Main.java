package practice.string.p7;

import java.util.Scanner;

public class Main {
    public String solution(String word) {
        String answer = "YES";

        // 1. 앞뒤를 비교한 풀이
        /*word = word.toLowerCase();

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() -i -1)) {
                return "NO";
            }
        }*/

        // 2. StringBuilder로 뒤집어서 비교한 풀이.
        String tmp = new StringBuilder(word).reverse().toString();
        if (!word.equalsIgnoreCase(tmp)){
            answer = "NO";
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
