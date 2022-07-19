package practice.twopointer.p5;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int answer = 0;
        int rt = 1;
        int lt = 1;
        int sum = 0;

        while (rt != n / 2 + 1) {
            if (sum == n) {
                answer++;
                sum -= rt++;
            } else if (sum < n) {
                sum += lt++;
            }
            while (sum > n) {
                sum -= rt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}
