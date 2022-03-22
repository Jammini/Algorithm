package leetcode.p1561;

import java.util.*;

public class Solution {
    public int maxCoins(int[] piles) {
        int answer = 0;
        List<Integer> list = new ArrayList();

        for (int pile : piles) {
            list.add(pile);
        }
        Collections.sort(list);
        int num = 0;
        for (int i = 0; i < list.size() / 3; i++) {
            answer += list.get((list.size() / 3) + (++num + i) - 1);
        }
        return answer;
    }
}
