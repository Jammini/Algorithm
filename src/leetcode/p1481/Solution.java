package leetcode.p1481;

import java.util.*;

public class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Number> list = new ArrayList<>();

        for(int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int key : map.keySet()) {
            int value = map.get(key);
            list.add(new Number(key, value));
        }

        list.sort((a, b) -> a.count - b.count);

        int cnt = 0;
        for(int i = 0; i < list.size(); i++) {
            if(k <= 0) {
                break;
            }
            if(list.get(i).count <= k) {
                k -= list.get(i).count;
                cnt++;
            }
        }
        return list.size() - cnt;
    }

    class Number {
        int num;
        int count;

        Number(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
}
