package leetcode.p2149;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for(int num : nums) {
            if(num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            answer[i] = (i % 2 == 0) ? positives.get(i / 2) : negatives.get(i / 2);
        }
        return answer;
    }
}
