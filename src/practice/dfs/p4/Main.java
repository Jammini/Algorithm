package practice.dfs.p4;

import java.util.Scanner;

public class Main {
    static int[] pm;
    static int n, m;

    public void solution(int L) {

        if (L == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                solution(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.solution(0);
    }
}
