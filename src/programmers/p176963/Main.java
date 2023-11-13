package programmers.p176963;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}))); // [19, 15, 6]
        System.out.println(Arrays.toString(new Solution().solution(
                new String[]{"kali", "mari", "don"},
                new int[]{11, 1, 55},
                new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}}))); // [67, 0, 55]
        System.out.println(Arrays.toString(new Solution().solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}}))); // [5, 15, 0]
    }
}
