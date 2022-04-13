package leetcode.p605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev = 0;
        int next = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            // index out of range 방지
            if (i == 0) {
                prev = 0;
            } else {
                prev = flowerbed[i - 1];
            }
            // index out of range 방지
            if (i == flowerbed.length - 1) {
                next = 0;
            } else {
                next = flowerbed[i + 1];
            }

            if (prev == 0 && flowerbed[i] == 0 && next == 0) {
                flowerbed[i] = 1;
                n--;
            }

        }
        return n <= 0;
    }
}
