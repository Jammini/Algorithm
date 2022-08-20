package practice.tree.p2;

public class Main {
    static int n;
    static int[] ch;

    public void solution(int L) {
        if (L == n + 1) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp.append(i).append(" ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1;
            solution(L + 1);
            ch[L] = 0;
            solution(L + 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n + 1];
        T.solution(1);
    }
}
