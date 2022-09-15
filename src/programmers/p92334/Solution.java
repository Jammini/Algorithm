package programmers.p92334;

import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap();
        List<String> list = new ArrayList<>();

        for (String value : id_list) {
            map.put(value, new HashSet<>());
        }

        for (String value : report) {
            String[] s = value.split(" ");
            map.get(s[0]).add(s[1]);
        }

        for (String s : id_list) {
            int count = 0;
            for (String key : map.keySet()) {
                if (map.get(key).contains(s)) {
                    count++;
                }
            }
            if (count >= k) {
                list.add(s);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            int count = 0;
            for (String s : list) {
                if (map.get(id_list[i]).contains(s)) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
