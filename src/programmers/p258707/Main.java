package programmers.p258707;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(4,
            new int[]{3, 6, 7, 2, 1, 10, 5, 9, 8, 12, 11, 4})); // 5
        System.out.println(new Solution().solution(3,
            new int[]{1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11, 12})); // 2
        System.out.println(new Solution().solution(2,
            new int[]{5, 8, 1, 2, 9, 4, 12, 11, 3, 10, 6, 7})); // 4
        System.out.println(new Solution().solution(10,
            new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18})); // 1
    }
}
