package leetcode.p621;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().leastInterval(new char[]{'A','A','A','B','B','B'}, 2)); // 8
        System.out.println(new Solution().leastInterval(new char[]{'A','C','A','B','D','B'}, 1)); // 6
        System.out.println(new Solution().leastInterval(new char[]{'A','A','A','B','B','B'}, 3)); // 10
    }
}
