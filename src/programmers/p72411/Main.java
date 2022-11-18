package programmers.p72411;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}))); // ["AC", "ACDE", "BCFG", "CDE"]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5}))); // ["ACD", "AD", "ADE", "CD", "XYZ"]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4}))); // ["WX", "XY"]
    }
}
