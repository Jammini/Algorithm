package programmers.p42579;

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> numMap = new HashMap<>();
        Map<String, Map<Integer, Integer>> playMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            numMap.put(genres[i], numMap.getOrDefault(genres[i], 0) + plays[i]);

            Map<Integer, Integer> map = new HashMap<>();
            map.put(i, plays[i]);
            if (playMap.get(genres[i]) == null) {
                playMap.put(genres[i], map);
            } else {
                playMap.get(genres[i]).put(i, plays[i]);
            }
        }
        List<String> keySet = new ArrayList(numMap.keySet());
        Collections.sort(keySet, (s1, s2) -> numMap.get(s2) - (numMap.get(s1)));

        for (String key : keySet) {
            Map<Integer, Integer> map = playMap.get(key);
            List<Integer> numList = new ArrayList(map.keySet());

            Collections.sort(numList, (s1, s2) -> map.get(s2) - (map.get(s1)));

            list.add(numList.get(0));
            if (numList.size() > 1) {
                list.add(numList.get(1));
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}