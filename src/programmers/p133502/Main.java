package programmers.p133502;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1})); // 2
        System.out.println(new Solution().solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2})); // 0
        System.out.println(new Solution().solution(new int[]{1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1})); // 3
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1})); // 5
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1})); // 3
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1})); // 3
        System.out.println(new Solution().solution(new int[]{1, 2, 2, 3, 1})); // 3
    }
}
