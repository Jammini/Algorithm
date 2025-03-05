package programmers.p161990;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{".#...", "..#..", "...#."}))); // [0, 1, 3, 4]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."}))); // [1, 3, 5, 8]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."}))); // [0, 0, 7, 9]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"..", "#."}))); // [1, 0, 2, 1]
    }
}
