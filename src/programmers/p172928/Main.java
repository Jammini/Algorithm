package programmers.p172928;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2","W 1"}))); // [2, 1]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"}))); // [0, 1]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"}))); // [0, 0]
    }
}
