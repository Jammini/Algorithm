package programmers.p250137;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(
            new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}})); // 5
        System.out.println(new Solution().solution(
            new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}})); // -1
        System.out.println(new Solution().solution(
            new int[]{4, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}})); // -1
        System.out.println(new Solution().solution(
            new int[]{1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}})); // 3

    }
}
