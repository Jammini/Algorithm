package practice.dfs.nm.p1;

public class NM1 {
    boolean[] visited;
    int[] arr;

    public void Solution(int N, int M) {
        visited = new boolean[N];
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
            if (!visited[i]) {
                visited[i] = true;
                arr[L] = i + 1;
                dfs(N, M, L + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        new NM1().Solution(3, 1);
        new NM1().Solution(4, 2);
        new NM1().Solution(4, 4);
    }
}
