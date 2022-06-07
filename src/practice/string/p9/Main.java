package practice.string.p9;

import java.util.Scanner;

public class Main {
    public int solution(String word) {

        // 방법1. 아스키 넘버를 이용해서 푸는 방법
        /*int answer = 0;

        for (char x : word.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }*/

        // 방법2. Character.isDigit를 이용하여 숫자인지를 판별하는 방법.
        String answer = "";

        for (char x : word.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(T.solution(word));
    }
}