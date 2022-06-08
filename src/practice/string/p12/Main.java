package practice.string.p12;

import java.util.Scanner;

public class Main {
    public String solution(int num, String code) {
        String answer = "";

        // 방법 1
        /*int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            int tmp = 0;
            int p = 6;
            for (char x : code.substring(i * 7, i * 7 + 7).toCharArray()) {
                if (x == '#') {
                    tmp += Math.pow(2, p);
                }
                p--;
            }
            nums[i] = tmp;
        }
        for (int i = 0; i < nums.length; i++) {
            answer += (char) nums[i];
        }*/

        // 방법 2
        for (int i = 0; i < num; i++) {
            String tmp = code.substring(0, 7).replace('#', '1').replace('*', '0');
            int digit = Integer.parseInt(tmp, 2);
            answer += (char) digit;
            code = code.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        String code = in.nextLine();
        System.out.print(T.solution(Integer.parseInt(number), code));
    }
}