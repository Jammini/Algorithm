package programmers.p67258;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"}))); // [3, 7]
        System.out.println(Arrays.toString(s.solution(new String[]{"AA", "AB", "AC", "AA", "AC"}))); // [1, 3]
        System.out.println(Arrays.toString(s.solution(new String[]{"XYZ", "XYZ", "XYZ"}))); // [1, 1]
        System.out.println(Arrays.toString(s.solution(new String[]{"ZZZ", "YYY", "NNNN", "YYY", "BBB"}))); // [1, 5]
    }
}
