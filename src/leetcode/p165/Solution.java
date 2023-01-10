package leetcode.p165;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int max = Integer.max(v1.length, v2.length);

        for (int i = 0; i < max; i++) {
            int v1Num = i >= v1.length ? 0 : Integer.parseInt(v1[i]);
            int v2Num = i >= v2.length ? 0 : Integer.parseInt(v2[i]);
            if (v1Num < v2Num) {
                return -1;
            } else if (v1Num > v2Num) {
                return 1;
            }
        }
        return 0;
    }
}
