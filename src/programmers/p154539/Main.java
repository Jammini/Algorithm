package programmers.p154539;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{2, 3, 3, 5}))); // [3, 5, 5, -1]
        System.out.println(Arrays.toString(new Solution().solution(new int[]{9, 1, 5, 3, 6, 2}))); // [-1, 5, 6, 6, -1, -1]
    }
}
