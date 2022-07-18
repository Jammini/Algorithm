package practice.twopointer.p3;

import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                sum += arr[i];
            } else {
                sum += arr[i] - arr[i - k];
                answer = Math.max(answer, sum);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(T.solution(n, k, a));
    }
}
