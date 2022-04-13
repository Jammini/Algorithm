package leetcode.p357;

import java.util.HashSet;

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        int answer = 0;

        HashSet<Integer> set = new HashSet();


        for (int i = 11; i < Math.pow(10, n); i++) {

            int num = i;

            while (num != 0) {
                System.out.println("num = " + num + " set = " + set.toString());
                if (set.contains(num % 10)) {
                    answer++;
                    set.clear();
                    break;
                } else {
                    set.add(num % 10);
                    num = num / 10;
                }
            }
            set.clear();
        }
        return (int) (Math.pow(10, n) - answer);
    }
}
