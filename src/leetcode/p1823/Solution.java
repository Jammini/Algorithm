package leetcode.p1823;

import java.util.*;

public class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        while(list.size() > 1) {
            int size = list.size();
            index = index + k - 1;
            size = index % size;
            list.remove(size);
            index = size;
        }
        return list.get(0);
    }
}
