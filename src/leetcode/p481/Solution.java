package leetcode.p481;

public class Solution {
    public int magicalString(int n) {
        StringBuilder magic = new StringBuilder("122");
        int groupIndex = 2;

        while (magic.length() < n) {
            char lastDigit = magic.charAt(magic.length() - 1);
            char nextDigit = (lastDigit == '1') ? '2' : '1';
            int groupSize = magic.charAt(groupIndex) - '0';

            for (int i = 0; i < groupSize; i++) {
                magic.append(nextDigit);
            }
            groupIndex++;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (magic.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
