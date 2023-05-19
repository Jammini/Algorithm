package leetcode.p875;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Integer.MIN_VALUE;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        while (min < max) {
            int mid = (min + max) / 2;

            if (saveHoursToEat(piles, mid) > h) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    private int saveHoursToEat(int[] piles, int mid) {
        int h = 0;
        for (int pile : piles) {
            h += Math.ceil((double) pile / mid);
        }
        return h;
    }
}
