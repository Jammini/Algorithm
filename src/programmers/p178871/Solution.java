package programmers.p178871;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int num = map.get(calling);
            map.put(calling, num - 1);
            map.put(players[num - 1], num);

            String temp = players[num];
            players[num] = players[num - 1];
            players[num - 1] = temp;
        }
        return players;
    }
}
