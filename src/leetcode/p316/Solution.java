package leetcode.p316;

public class Solution {
    public String removeDuplicateLetters(String s) {
        int[] letterCount = new int[26];
        int[] visited = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']--;
            if (visited[s.charAt(i) - 'a'] == 0) {
                while (sb.length() != 0 && (sb.charAt(sb.length() - 1) > s.charAt(i)) &&
                        letterCount[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                    visited[sb.charAt(sb.length() - 1) - 'a'] = 0;
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append(s.charAt(i));
                visited[s.charAt(i) - 'a'] = 1;
            }
        }
        return sb.toString();
    }
}