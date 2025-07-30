package leetcode.p529;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().updateBoard(
            new char[][]{{'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}}, new int[]{3, 0})));
        System.out.println(Arrays.deepToString(new Solution().updateBoard(
            new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'}, {'B', 'B', 'B', 'B', 'B'}}, new int[]{3, 0})));
    }
}
