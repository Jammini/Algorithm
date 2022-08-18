package practice.recursive.p2;

public class Main {
    public void solution(int n) {
        if (n == 0) {
            return;
        } else {
            solution(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.solution(11);
    }
}
