package practice.hashmap.p5;

import java.util.*;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : tSet) {
            cnt++;
            if (cnt == k)
                return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
