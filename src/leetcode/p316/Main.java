package leetcode.p316;

/**
 * https://leetcode.com/problems/remove-duplicate-letters/submissions/944194523/
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicateLetters("bcabc")); // "abc"
        System.out.println(new Solution().removeDuplicateLetters("cbacdcbc")); // "acdb"
    }
}