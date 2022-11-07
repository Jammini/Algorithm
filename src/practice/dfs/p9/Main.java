package practice.dfs.p9;

import java.util.Scanner;

public class Main {
    static int[] combi;
    static int n, m;

    public void dfs(int L, int s) {
        if (L >= m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.dfs(0, 1);
    }
}
