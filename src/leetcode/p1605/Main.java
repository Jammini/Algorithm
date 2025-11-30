package leetcode.p1605;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().restoreMatrix(new int[]{3, 8}, new int[]{4, 7}))); // [[3,0], [1,7]]
        System.out.println(Arrays.deepToString(new Solution().restoreMatrix(new int[]{5, 7, 10}, new int[]{8, 6, 8}))); // [[0,5,0], [6,1,0], [2,0,8]]
    }
}
