package programmers.p142086;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("banana"))); // [-1, -1, -1, 2, 2, 2]
        System.out.println(Arrays.toString(new Solution().solution("foobar"))); // [-1, -1, 1, -1, -1, -1]
    }
}
