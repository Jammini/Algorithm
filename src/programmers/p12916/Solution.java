package programmers.p12916;

public class Solution {
    boolean solution(String s) {
        int pNum = 0;
        int yNum = 0;
        s = s.toUpperCase();
        for (char alphabet : s.toCharArray()) {
            if (alphabet == 'P') {
                pNum++;
            } else if (alphabet == 'Y') {
                yNum++;
            }
        }
        return (pNum == yNum);
    }
}
