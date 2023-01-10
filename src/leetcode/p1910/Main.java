package leetcode.p1910;

/**
 * https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeOccurrences("daabcbaabcbc", "abc")); // dab
        System.out.println(s.removeOccurrences("axxxxyyyyb", "xy")); // ab
    }
}
