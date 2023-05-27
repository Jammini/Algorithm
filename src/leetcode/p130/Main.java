package leetcode.p130;

/**
 * https://leetcode.com/problems/find-peak-element/
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.solve(new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}});
        s.solve(new char[][]{{'X'}});
    }
}
