package leetcode.p1559;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().containsCycle(new char[][]{{'a','a','a','a'},{'a','b','b','a'},{'a','b','b','a'},{'a','a','a','a'}})); // true
        System.out.println(new Solution().containsCycle(new char[][]{{'c','c','c','a'},{'c','d','c','c'},{'c','c','e','c'},{'f','c','c','c'}})); // true
        System.out.println(new Solution().containsCycle(new char[][]{{'a','b','b'},{'b','z','b'},{'b','b','a'}})); // false
        System.out.println(new Solution().containsCycle(new char[][]{{'c','a','d'},{'a','a','a'},{'a','a','d'},{'a','c','d'},{'a','b','c'}})); // true
    }
}
