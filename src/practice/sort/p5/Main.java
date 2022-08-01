package practice.sort.p5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public char solution(int n, int[] arr) {
        char answer = 'U';
        Set<Integer> set = new HashSet<>();

        for (int j : arr) {
            if (!set.contains(j)) {
                set.add(j);
            } else {
                answer = 'D';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 8
        int[] arr = new int[n]; // 20 25 52 30 39 33 43 33
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
