package practice.array.p2;

import java.util.Scanner;

public class Main {
    public int solution(int num, int[] arr) {
        int big = arr[0];
        int answer = 1;
        for (int i = 1; i < num; i++) {
            if (big < arr[i]) {
                answer++;
                big = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];

        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(input1, arr));
    }
}
