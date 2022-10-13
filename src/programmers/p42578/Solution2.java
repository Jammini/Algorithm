package programmers.p42578;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        for (String key : map.keySet()) {
            answer += map.get(key) + answer * map.get(key);
        }
        return answer;
    }
}