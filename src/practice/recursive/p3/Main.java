package practice.recursive.p3;

public class Main {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n - 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        System.out.println(T.solution(5));
    }
}
