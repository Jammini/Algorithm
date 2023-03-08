package leetcode.p394;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().decodeString("3[a]12[bc]")); // "aaabcbc"
        System.out.println(new Solution().decodeString("3[a2[c]]")); // "accaccacc"
        System.out.println(new Solution().decodeString("2[abc]3[cd]ef")); // "abcabccdcdcdef"
    }
}