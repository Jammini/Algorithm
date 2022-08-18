package practice.recursive.p1;

public class Main {
    public void solution(int n) {
        if (n == 0) {
            return;
        } else {
            solution(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.solution(3);
    }
}
