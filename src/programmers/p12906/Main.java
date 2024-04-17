package programmers.p12906;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(new Solution().solution(new int[]{4, 4, 4, 3, 3})));
        System.out.println(Arrays.toString(new Solution2().solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(new Solution2().solution(new int[]{4, 4, 4, 3, 3})));
    }
}
