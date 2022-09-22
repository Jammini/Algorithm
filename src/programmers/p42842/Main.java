package programmers.p42842;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(10, 2))); // [4, 3]
        System.out.println(Arrays.toString(new Solution().solution(8, 1))); // [3, 3]
        System.out.println(Arrays.toString(new Solution().solution(24, 24))); // [8, 6]
        System.out.println(Arrays.toString(new Solution().solution(18, 6))); // [8, 3]
    }
}
