package practice.sort.p4;

import java.util.*;

public class Main {
    public int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];


        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (x == answer[i]) pos = i;
            }
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            answer[0] = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); // 5
        int n = in.nextInt(); // 9
        int[] arr = new int[n]; // 1 2 3 2 6 2 3 5 7
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : T.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
