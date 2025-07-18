package leetcode.p79;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().exist(new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCCED")); // true
        System.out.println(new Solution().exist(new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "SEE")); // true
        System.out.println(new Solution().exist(new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCB")); // false
    }
}
