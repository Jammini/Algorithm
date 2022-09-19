package programmers.p70129;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("110010101001"))); // [3,8]
        System.out.println(Arrays.toString(new Solution().solution("01110"))); // [3,3]
        System.out.println(Arrays.toString(new Solution().solution("1111111"))); // [4,1]
    }
}
