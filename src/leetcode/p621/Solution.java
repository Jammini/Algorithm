package leetcode.p621;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();

        for(char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        int max = 0;
        int maxCount = 0;
        for(Character c : map.keySet()) {
            max = Math.max(max, map.get(c));
        }

        for(Character c : map.keySet()) {
            if (max ==  map.get(c)) {
                maxCount++;
            }
        }
        return Math.max(tasks.length, (max - 1) * (n + 1) + maxCount);
    }
}
