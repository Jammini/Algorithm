package programmers.p138476;

import java.util.*;

class Fruit implements Comparable<Fruit> {

    int type;
    int taste;

    public Fruit(int type, int taste) {
        this.type = type;
        this.taste = taste;
    }

    @Override
    public int compareTo(Fruit o) {
        return o.taste - this.taste;
    }
}

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Fruit> list = new ArrayList<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Integer integer : map.keySet()) {
            list.add(new Fruit(integer, map.get(integer)));
        }

        Collections.sort(list);
        for (Fruit fruit : list) {
            if (k > 0) {
                k = k - fruit.taste;
                answer++;
            }
        }
        return answer;
    }
}
