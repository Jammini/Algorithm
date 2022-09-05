package programmers.p12950;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}))); // [[4, 6][7, 9]]
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}}))); // [[4][6]]
    }
}
