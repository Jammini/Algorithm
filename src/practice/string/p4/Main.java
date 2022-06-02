package practice.string.p4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] words) {
        ArrayList<String> answer = new ArrayList<>();

        // 방법1. StringBuilder로 간단하게 뒤집기
        /*for (String x : words) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }*/

        // 방법2. StringBuilder 사용 안해서 뒤집기
        for (String x : words) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(s));
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] word = new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = in.next();
        }
        System.out.println(T.solution(n, word).toString());
    }
}
