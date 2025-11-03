package leetcode.p1190;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseParentheses("(abcd)")); // "dcba"
        System.out.println(new Solution().reverseParentheses("(u(love)i)")); // "iloveu"
        System.out.println(new Solution().reverseParentheses("(ed(et(oc))el)")); // "leetcode"
    }
}
