package programmers.p12918;

public class Solution {
    public boolean solution(String s) {
        try {
            Integer.parseInt(s);
            if (s.length() != 4 && s.length() != 6) {
                System.out.println("s = " + s.length());
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
