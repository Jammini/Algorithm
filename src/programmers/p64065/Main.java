package programmers.p64065;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))); // [2,1,3,4]
        System.out.println(Arrays.toString(new Solution().solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"))); // [2,1,3,4]
        System.out.println(Arrays.toString(new Solution().solution("{{20,111},{111}}"))); // [111,20]
        System.out.println(Arrays.toString(new Solution().solution("{{123}}"))); // [123]
        System.out.println(Arrays.toString(new Solution().solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))); // [3,2,4,1]
    }
}
