package practice.string.p5;

import java.util.Scanner;

public class Main {
    public String solution(String words) {
        String answer;
        char[] s = words.toCharArray();
        int lt = 0;
        int rt = words.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return answer = String.valueOf(s);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(T.solution(word));
    }
}
