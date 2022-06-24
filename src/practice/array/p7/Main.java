package practice.array.p7;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int x : arr) {
            if (x == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            answer += cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
