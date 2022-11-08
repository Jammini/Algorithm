package programmers.p42583;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1, 1, new int[]{1, 1, 1, 1})); // 5
        System.out.println(new Solution().solution(2, 10, new int[]{7, 4, 5, 6})); // 8
        System.out.println(new Solution().solution(3, 10, new int[]{7, 4, 5, 6})); // 11
        System.out.println(new Solution().solution(3, 10, new int[]{1, 2, 3, 2, 1, 2, 3})); // 10
        System.out.println(new Solution().solution(3, 10, new int[]{1, 1, 1, 1, 1, 1, 1})); // 10
        System.out.println(new Solution().solution(3, 5, new int[]{2, 2, 2, 2, 2, 2, 2})); // 13
        System.out.println(new Solution().solution(3, 5, new int[]{1, 1, 1, 1, 1, 1, 1})); // 10
        System.out.println(new Solution().solution(7, 5, new int[]{1, 1, 1, 1, 1, 1, 1})); // 16
        System.out.println(new Solution().solution(4, 10, new int[]{7, 4, 5, 6})); // 14
        System.out.println(new Solution().solution(4, 100, new int[]{7, 4, 5, 6})); // 8
        System.out.println(new Solution().solution(100, 100, new int[]{10})); // 101
        System.out.println(new Solution().solution(100, 50, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10})); // 204
    }
}
