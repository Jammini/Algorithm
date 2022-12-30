package programmers.p42840;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 2, 3, 4, 5}))); // [1]
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 3, 2, 4, 2}))); // [1,2,3]
    }
}
