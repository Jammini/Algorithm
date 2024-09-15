package programmers.p12909;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("()()")); // true
        System.out.println(new Solution().solution("(())()")); // true
        System.out.println(new Solution().solution(")()(")); // false
        System.out.println(new Solution().solution("(()(")); // false
        System.out.println(new Solution2().solution("()()")); // true
        System.out.println(new Solution2().solution("(())()")); // true
        System.out.println(new Solution2().solution(")()(")); // false
        System.out.println(new Solution2().solution("(()(")); // false
    }
}
