package practice.dfs.p2;

import java.util.Scanner;

public class Main {
    static int answer = Integer.MIN_VALUE, c, n;

    public void solution(int L, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            solution(L + 1, sum + arr[L], arr);
            solution(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.solution(0, 0, arr);
        System.out.println(answer);
    }
}
