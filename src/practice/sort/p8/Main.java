package practice.sort.p8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = n - 1;
        Arrays.sort(arr);

        while (lt <= rt) {
            int mid = (rt + lt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
            }
            if (arr[mid] < m) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 8
        int m = in.nextInt(); // 32
        int[] arr = new int[n]; // 23 87 65 12 57 32 99 81
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
