package programmers.p12939;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1 2 3 4")); // "1 4"
        System.out.println(new Solution2().solution("1 2 3 4")); // "1 4"
        System.out.println(new Solution().solution("-1 -2 -3 -4")); // "-4 -1"
        System.out.println(new Solution2().solution("-1 -2 -3 -4")); // "-4 -1"
        System.out.println(new Solution().solution("-1 -1")); // "-1 -1"
        System.out.println(new Solution2().solution("-1 -1")); // "-1 -1"
    }
}
