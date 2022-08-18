package practice.recursive.p4;

public class Main {
    static int[] fibo;
    public int solution(int n) {
        if (fibo[n] > 0){
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = solution(n - 2) + solution( n - 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        int n = 5;
        fibo = new int[n + 1];
        T.solution(n);
        for (int i = 1; i <= fibo.length; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
