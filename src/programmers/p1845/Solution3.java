package programmers.p1845;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int solution(int[] nums) {
        int answer = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (answer > map.size()) {
            answer = map.size();
        }
        return answer;
    }
}
