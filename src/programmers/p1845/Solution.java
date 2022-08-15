package programmers.p1845;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (nums.length / 2 < map.size()) {
            answer = nums.length / 2;
        } else {
            answer = map.size();
        }
        return answer;
    }
}