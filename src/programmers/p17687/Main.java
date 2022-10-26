package programmers.p17687;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 4, 2, 1)); // "0111"
        System.out.println(s.solution(16, 16, 2, 1)); // "02468ACE11111111"
        System.out.println(s.solution(16, 16, 2, 2)); // "13579BDF01234567"
    }
}
