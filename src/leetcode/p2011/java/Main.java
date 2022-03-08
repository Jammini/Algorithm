package leetcode.p2011.java;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        System.out.println(s.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
    }
}
