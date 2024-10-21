package practice.dfs.nm.p5;

import java.util.Arrays;

public class NM5 {
    int[] arr;
    boolean[] visited;

    public void solution(int N, int M, int[] nums) {
        arr = new int[M];
        visited = new boolean[N];
        Arrays.sort(nums);
        dfs(N, M,  0, nums);
    }

    private void dfs(int N, int M, int L, int[] nums) {
        if (L == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[L] = nums[i];
                dfs(N, M,L + 1, nums);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        new NM5().solution(3, 1, new int[]{4, 5, 2});
        new NM5().solution(4, 2, new int[]{9, 8, 7, 1});
        new NM5().solution(4, 4, new int[]{1231, 1232, 1233, 1234});
    }
}
