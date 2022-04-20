package leetcode.p202;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        int digit = n;
        int sumDigit = 0;
        HashSet set = new HashSet();
        set.add(n);

        while (true) {
            sumDigit += (digit % 10) * (digit % 10);
            digit = digit / 10;

            if (digit == 0) {
                if (set.contains(sumDigit)) {
                    break;
                }
                set.add(sumDigit);
                digit = sumDigit;
                sumDigit = 0;
            }
        }
        return sumDigit == 1;
    }
}
