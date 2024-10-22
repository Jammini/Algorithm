package practice.dfs.nm.p8;

import java.util.Arrays;

public class NM8 {
    int[] arr;

    public void solution(int N, int M, int[] nums) {
        arr = new int[M];
        Arrays.sort(nums);
        dfs(N, M,  0,0, nums);
    }

    private void dfs(int N, int M, int index, int L, int[] nums) {
        if (L == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = index; i < N; i++) {
            arr[L] = nums[i];
            dfs(N, M, i,L + 1, nums);
        }
    }

    public static void main(String[] args) {
        new NM8().solution(3, 1, new int[]{4, 5, 2});
        new NM8().solution(4, 2, new int[]{9, 8, 7, 1});
        new NM8().solution(4, 4, new int[]{1231, 1232, 1233, 1234});
    }
}
