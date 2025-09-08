package leetcode.p2178;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> result = new ArrayList<>();

        if(finalSum % 2 != 0) {
            return result;
        }

        long sum = 0;
        for(long num = 2; sum + num <= finalSum; num += 2) {
            result.add(num);
            sum += num;
        }

        if(sum < finalSum) {
            long last = result.remove(result.size() - 1);
            result.add(finalSum - sum + last);
        }
        return result;
    }
}
