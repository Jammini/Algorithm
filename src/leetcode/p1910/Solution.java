package leetcode.p1910;

public class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            StringBuilder sb = new StringBuilder();
            sb.append(s, 0, s.indexOf(part));
            sb.append(s.substring(s.indexOf(part) + part.length()));
            s = sb.toString();
        }
        return s;
    }
}
