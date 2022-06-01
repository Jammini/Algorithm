package practice.string.p2;

import java.util.Scanner;

public class Main {
    public String solution(String words) {
        String conversionSmallWords = words.toUpperCase();
        String conversionBigWords = words.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == conversionSmallWords.charAt(i)) {
                sb.append(conversionBigWords.charAt(i));
            } else {
                sb.append(conversionSmallWords.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(T.solution(input1));
    }
}
