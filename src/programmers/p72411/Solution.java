package programmers.p72411;

import java.util.*;

public class Solution {
    Map<String, Integer> map;
    List<String> list = new ArrayList<>();

    public String[] solution(String[] orders, int[] course) {
        for (int num : course) {
            map = new HashMap<>();
            for (String order : orders) {
                if (order.length() >= num) {
                    makeSet(order.split(""), num, "", 0);
                }
            }
            orderKingMenu(map);
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }

    /**
     * 세트 메뉴를 구상한 메뉴중 베스트 메뉴를 뽑아서 리스트에 넣는다.
     * @param map 각 코스별 맵 key = 메뉴조합 value = 주문횟수
     */
    private void orderKingMenu(Map<String, Integer> map) {
        int max = 1;
        String set = "";
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                set = key;
            }
        }
        if ("".equals(set)) {
            return;
        }
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }
    }

    /**
     * 세트메뉴를 만들어 맵에 넣는다.
     */
    private void makeSet(String[] order, int num, String sum, int startNum) {
        Arrays.sort(order);
        if (num <= sum.length()) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        } else {
            for (int i = startNum; i < order.length; i++) {
                makeSet(order, num, sum + order[i], i + 1);
            }
        }
    }
}
