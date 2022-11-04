package practice.dfs.p7;

import java.util.Scanner;

public class Main {
    static int[][] arr;
    public int dfs(int n, int r) {
        if (arr[n][r] > 0) {
            return arr[n][r];
        }
        if (r == 0 || n == r) {
            return 1;
        }
        return arr[n][r] = dfs(n-1, r-1) + dfs(n -1, r);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        arr = new int[n + 1][n + 1];
        System.out.println(T.dfs(n, r));
    }
}
