package practice.dfs.nm.p4;

public class NM4 {
    int[] arr;

    public void solution(int N, int M) {
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
            dfs(N, M, i,L + 1);
        }
    }

    public static void main(String[] args) {
        new NM4().solution(3, 1);
        new NM4().solution(4, 2);
        new NM4().solution(4, 4);
    }
}
