package programmers.p68644;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(s2.solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{5, 0, 2, 7})));
        System.out.println(Arrays.toString(s2.solution(new int[]{5, 0, 2, 7})));
    }
}
