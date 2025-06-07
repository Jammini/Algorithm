package programmers.p258711;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(
            Arrays.deepToString(new int[][]{{2, 3}, {4, 3}, {1, 1}, {2, 1}})); // [2,1,1,0]
        System.out.println(Arrays.deepToString(
            new int[][]{{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6},
                {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}})); // [4, 0, 1, 2]
    }
}
