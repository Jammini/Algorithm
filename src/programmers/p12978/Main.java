package programmers.p12978;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(5, new int[][]{{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}}, 3)); // 4
        System.out.println(new Solution().solution(6, new int[][]{{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}}, 4)); // 4
    }
}
