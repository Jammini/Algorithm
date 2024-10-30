package practice.dfs.nm.p2;

public class NM2 {
    int[] arr;

    public void Solution(int N, int M) {
        arr = new int[M];
        dfs(N, M, 0, 0);
    }

    private void dfs(int N, int M, int index, int L) {
        if (L == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = index; i < N; i++) {
            arr[L] = i + 1;
            dfs(N, M, i + 1, L + 1);
        }
    }

    public static void main(String[] args) {
        new NM2().Solution(3, 1);
        new NM2().Solution(4, 2);
        new NM2().Solution(4, 4);
    }
}
