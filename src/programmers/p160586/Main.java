package programmers.p160586;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"}))); // [9, 4]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"AA"}, new String[]{"B"}))); // [-1]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"}))); // [4, 6]
    }
}
