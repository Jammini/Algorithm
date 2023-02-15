package programmers.p154540;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"}))); // [1, 1, 27]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"XXX", "XXX", "XXX"}))); // [-1]
    }
}
