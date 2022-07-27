package practice.sort.p1;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr) {
        int[] answer = arr;
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 6
        int[] arr = new int[n]; // 13 5 11 7 23 15
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
