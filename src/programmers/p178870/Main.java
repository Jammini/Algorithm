package programmers.p178870;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 7))); // [2, 3]
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5))); // [6, 6]
        System.out.println(Arrays.toString(new Solution().solution(new int[]{2, 2, 2, 2, 2}, 6))); // [0, 2]
    }
}
