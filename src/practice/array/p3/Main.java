package practice.array.p3;

import java.util.Scanner;

public class Main {
    public String solution(int num, int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            if (arr1[i] == arr2[i]) {
                sb.append("D");
            } else if (arr1[i] == 1 && arr2[i] == 3) {
                sb.append("A");
            } else if (arr1[i] == 2 && arr2[i] == 1) {
                sb.append("A");
            } else if (arr1[i] == 3 && arr2[i] == 2) {
                sb.append("A");
            } else {
                sb.append("B");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr1 = new int[input1];
        int[] arr2 = new int[input1];

        for (int i = 0; i < input1; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < input1; i++) {
            arr2[i] = in.nextInt();
        }
        for (char x : T.solution(input1, arr1, arr2).toCharArray()) {
            System.out.println(x);
        }
    }
}
