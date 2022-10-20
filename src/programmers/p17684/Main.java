package programmers.p17684;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("KAKAO"))); // [11, 1, 27, 15]
        System.out.println(Arrays.toString(s.solution("TOBEORNOTTOBEORTOBEORNOT"))); // [20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]
        System.out.println(Arrays.toString(s.solution("ABABABABABABABAB"))); // [1, 2, 27, 29, 28, 31, 30]
    }
}
