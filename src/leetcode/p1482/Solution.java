package leetcode.p1482;

public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlower = (long) m * k;

        // 꽃의 총 개수보다 필요한 꽃 수가 많으면 -1 리턴
        if(totalFlower > bloomDay.length) {
            return -1;
        }

        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        // 최소,최대 날 구하기
        for(int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        // 이진탐색으로 최소날 구하기
        while (min < max) {
            long mid = (min + max) / 2;
            if(canMake(bloomDay, m, k, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return (int) min;
    }

    private boolean canMake(int[] bloomDay, int m, int k, long mid) {
        int bouquets = 0; // 만든 꽃다발 수
        int flower = 0;  // 인접한 피어난 꽃 수

        for(int day : bloomDay) {
            if(day <= mid) {
                flower++;
                if (flower == k) {
                    bouquets++;
                    flower = 0;
                    if (bouquets >= m) {
                        return true;
                    }
                }
            } else { // 인접이 끊김
                flower = 0;
            }
        }
        return bouquets >= m;
    }
}
