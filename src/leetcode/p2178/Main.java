package leetcode.p2178;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().maximumEvenSplit(new int[]{3, 1, -2, -5, 2, -4}))); // [3,-2,1,-5,2,-4]
        System.out.println(Arrays.toString(new Solution().maximumEvenSplit(new int[]{-1, 1}))); // [1,-1]
    }
}
