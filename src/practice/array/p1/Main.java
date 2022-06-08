package practice.array.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < num; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
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

        for (int x : T.solution(input1, arr)) {
            System.out.print(x + " ");
        }
    }
}
