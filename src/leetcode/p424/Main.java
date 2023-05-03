package leetcode.p424;

/**
 * https://leetcode.com/problems/longest-repeating-character-replacement/description/
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().characterReplacement("ABAB", 2)); // 4
        System.out.println(new Solution().characterReplacement("AABABBA", 1)); // 4
    }
}
