package practice.dfs.p5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;

    public void solution(int L, int sum, Integer[] arr) {
        if (sum > m || answer <= L) {
            return;
        }

        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < arr.length; i++) {
                solution(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = kb.nextInt();
        T.solution(0, 0, arr);
        System.out.println(answer);
    }
}
