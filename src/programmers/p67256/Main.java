package programmers.p67256;

public class Main {
    public static void main(String[] args) {
        // LRLLLRLLRRL
        System.out.println(new Solution().solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        // LRLLRRLLLRR
        System.out.println(new Solution().solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        // LLRLLRLLRL
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));

    }
}
