package leetcode.p2305;

public class Solution {
    public int distributeCookies(int[] cookies, int k) {
        return dfs(cookies, k, 0, new int[k]);
    }

    public int dfs(int[] cookies, int k, int level, int[] buckets) {
        if(level == cookies.length) {
            int max = 0;
            for (int bucket : buckets) {
                if (bucket > max) {
                    max = bucket;
                }
            }
            return max;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] += cookies[level];
            min = Math.min(min, dfs(cookies, k, level + 1, buckets));
            buckets[i] -= cookies[level];
        }
        return min;
    }
}
