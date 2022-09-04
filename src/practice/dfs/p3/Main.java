package practice.dfs.p3;

import java.util.Scanner;

public class Main {
    static int answer = Integer.MIN_VALUE, m, n;
    boolean flag = false;

    public void solution(int L, int sum, int time, int[] ps, int[] pt) {
        if (m < time) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            solution(L + 1, sum + ps[L], time + pt[L], ps, pt);
            solution(L + 1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.solution(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
