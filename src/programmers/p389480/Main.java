package programmers.p389480;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{1, 2}, {2, 3}, {2, 1}}, 4, 4)); // 2
        System.out.println(new Solution().solution(new int[][]{{1, 2}, {2, 3}, {2, 1}}, 1, 7)); // 0
        System.out.println(new Solution().solution(new int[][]{{3, 3}, {3, 3}}, 7, 1)); // 6
        System.out.println(new Solution().solution(new int[][]{{3, 3}, {3, 3}}, 6, 1)); // -1
    }
}
