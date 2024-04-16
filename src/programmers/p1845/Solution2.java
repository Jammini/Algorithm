package programmers.p1845;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int solution(int[] nums) {
        int size = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (size > map.size()) {
            return map.size();
        }
        return size;
    }
}