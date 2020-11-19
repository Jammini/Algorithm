package programmers.P42578;

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        int count = 0;
        String sort = "";

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < clothes.length; i++) {
            sort = clothes[i][1];

            count = 0;
            for (int j = 0; j < clothes.length; j++) {
                if (sort.equals(clothes[j][1])) {
                    count++;
                }
            }
            map.put(sort, count);
        }
        for (String key : map.keySet()) {
            answer += map.get(key) + answer * map.get(key);
        }
        return answer;
    }
}