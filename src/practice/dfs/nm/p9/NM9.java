package practice.dfs.nm.p9;

import java.util.Arrays;

public class NM9 {
    int[] arr;
    boolean[] visited;

    public void solution(int N, int M, int[] nums) {
        arr = new int[M];
        visited = new boolean[N];
        Arrays.sort(nums);
        dfs(N, M, 0, nums);
    }

    private void dfs(int N, int M, int L, int[] nums) {
        if (L == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        int before = 0;
        for (int i = 0; i < N; i++) {
            if (visited[i]) {
                continue;
            }
            if (before != nums[i]) {
                before = nums[i];
                visited[i] = true;
                arr[L] = nums[i];
                dfs(N, M, L + 1, nums);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        new NM9().solution(3, 1, new int[]{4, 4, 2});
        new NM9().solution(4, 2, new int[]{9, 7, 9, 1});
        new NM9().solution(4, 4, new int[]{1, 1, 1, 1});
    }
}
