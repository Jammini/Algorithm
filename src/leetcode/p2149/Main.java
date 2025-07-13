package leetcode.p2149;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().rearrangeArray(new int[]{3, 1, -2, -5, 2, -4}))); // [3,-2,1,-5,2,-4]
        System.out.println(Arrays.toString(new Solution().rearrangeArray(new int[]{-1, 1}))); // [1,-1]
    }
}
