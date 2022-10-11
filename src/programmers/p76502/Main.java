package programmers.p76502;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("[](){}")); // 3
        System.out.println(new Solution().solution("}]()[{")); // 2
        System.out.println(new Solution().solution("[)(]")); // 0
        System.out.println(new Solution().solution("}}}")); // 0
    }
}
