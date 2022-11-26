package programmers.p77485;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}}))); // [8, 10, 25]
        System.out.println(Arrays.toString(new Solution().solution(3, 3, new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}}))); // [1, 1, 5, 3]
        System.out.println(Arrays.toString(new Solution().solution(100, 97, new int[][]{{1, 1, 100, 97}}))); // [1]
    }
}
