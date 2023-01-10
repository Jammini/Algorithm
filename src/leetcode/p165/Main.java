package leetcode.p165;

/**
 * https://leetcode.com/problems/compare-version-numbers/submissions/875250567/
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.compareVersion("1.01", "1.001")); // 0
        System.out.println(s.compareVersion("1.0", "1.0.0")); // 0
        System.out.println(s.compareVersion("0.1", "1.1")); // -1
    }
}
