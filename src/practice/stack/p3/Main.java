package practice.stack.p3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(int n, int[][] arr, int k, int[] num) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][num[i] - 1] != 0) {
                    int x = arr[j][num[i] - 1];
                    arr[j][num[i] - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == x) {
                        answer = answer + 2;
                        stack.pop();
                    } else {
                        stack.push(x);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int k = in.nextInt();
        int[] num = new int[k];
        for (int i = 0; i < k; i++) {
            num[i] = in.nextInt();
        }
        System.out.println(T.solution(n, arr, k, num));
    }
}
