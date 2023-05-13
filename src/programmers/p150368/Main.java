package programmers.p150368;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[][]{{40, 10000}, {25, 10000}}, new int[]{7000, 9000}))); // [1, 5400]
        System.out.println(Arrays.toString(new Solution().solution(new int[][]{{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}}, new int[]{1300, 1500, 1600, 4900}))); // [4, 13860]
    }
}
