package programmers.p12949;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}}))); // [[15, 15], [15, 15], [15, 15]]
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}))); // [[22, 22, 11], [36, 28, 18], [29, 20, 14]]
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3, 3}, {3, 3, 3}}))); // [[15, 15, 15], [15, 15, 15], [15, 15, 15]]
    }
}
