package leetcode.p921;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minAddToMakeValid("())")); // 1
        System.out.println(s.minAddToMakeValid("(((")); // 3
    }
}
