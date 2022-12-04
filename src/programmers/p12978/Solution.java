package programmers.p12978;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[] dis = new int[N + 1];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        List<List<Edge>> graph = new ArrayList<>();
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] ints : road) {
            int start = ints[0];
            int end = ints[1];
            int cost = ints[2];
            graph.get(start).add(new Edge(end, cost));
            start = ints[1];
            end = ints[0];
            graph.get(start).add(new Edge(end, cost));
        }
        pq.offer(new Edge(1, 0));
        dis[1] = 0;

        while (!pq.isEmpty()) {
            Edge tmp = pq.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) {
                continue;
            }
            for (Edge edge : graph.get(now)) {
                if (dis[edge.vex] > nowCost + edge.cost) {
                    dis[edge.vex] = nowCost + edge.cost;
                    pq.offer(new Edge(edge.vex, nowCost + edge.cost));
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            if (dis[i] <= K) {
                answer++;
            }
        }
        return answer;
    }
}

class Edge implements Comparable<Edge> {
    int vex;
    int cost;

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}