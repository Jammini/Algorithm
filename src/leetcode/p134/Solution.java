package leetcode.p134;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                index = i + 1;
            }
        }
        if (total < 0) {
            return -1;
        }
        return index;
    }
}
