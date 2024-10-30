package practice.dfs.nm.p3;

public class NM3 {
    int[] arr;

    public void Solution(int N, int M) {
        arr = new int[M];
        dfs(N, M, 0);
    }

    private void dfs(int N, int M, int L) {
        if (L == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[L] = i + 1;
            dfs(N, M, L + 1);
        }
    }

    public static void main(String[] args) {
        new NM3().Solution(3, 1);
        new NM3().Solution(4, 2);
        new NM3().Solution(4, 4);
    }
}
