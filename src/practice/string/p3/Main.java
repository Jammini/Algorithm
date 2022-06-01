package practice.string.p3;

import java.util.Scanner;

public class Main {
    public String solution(String words) {
        int length = 0;
        String answer = "";
        String[] arrayWord = words.split(" ");

        for (String s : arrayWord) {
            if (length < s.length()) {
                length = s.length();
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(T.solution(input1));
    }
}
