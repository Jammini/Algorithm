package programmers.p138477;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}))); // [10, 10, 10, 20, 20, 100, 100]
        System.out.println(Arrays.toString(new Solution().solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}))); // [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
    }
}
