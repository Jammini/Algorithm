package leetcode.p743;

import java.util.*;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        // map에 times 정보 저장
        for (int[] time : times) {
            int source = time[0];
            int target = time[1];
            int weight = time[2];
            map.putIfAbsent(source, new HashMap<>());
            map.get(source).put(target, weight);
        }

        // 각 노드까지의 최단 거리 저장
        int[] shortestDistances = new int[n + 1];
        Arrays.fill(shortestDistances, Integer.MAX_VALUE);
        shortestDistances[k] = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{k, 0});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentTarget = current[0];
            int currentWeight = current[1];

            for (int next : map.getOrDefault(currentTarget, new HashMap<>()).keySet()) {
                int weight = map.get(currentTarget).get(next);
                if (currentWeight + weight < shortestDistances[next]) {
                    shortestDistances[next] = currentWeight + weight;
                    queue.offer(new int[]{next, currentWeight + weight});
                }
            }
        }

        int max = 0;
        for (int i = 1; i < shortestDistances.length; ++i) {
            if (shortestDistances[i] == Integer.MAX_VALUE) {
                return -1;
            }
            max = Math.max(max, shortestDistances[i]);
        }
        return max;
    }
}
