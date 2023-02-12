package leetcode.p310;

import java.util.*;

public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> list = new ArrayList<>();
        int[] level = new int[n];

        // 각각의 루트노드의 개수를 구해 배열에 넣는다.
        for (int i = 0; i < n; i++) {
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[edges.length];
            queue.offer(i);
            level[i] = getLevelCount(1, edges, visited, queue);
        }

        System.out.println(Arrays.toString(level));
        // 각 트리에서 최소 레벨을 구한후 리스트에 담는다.
        int min = Integer.MAX_VALUE;
        for (int l : level) {
            min = Math.min(min, l);
        }
        for (int i = 0; i < level.length; i++) {
            if (level[i] == min) {
                list.add(i);
            }
        }
        return list;
    }


    public int getLevelCount(int level, int[][] edges, boolean[] visited, Queue<Integer> queue) {

        while (!queue.isEmpty()) { // 기존 큐가 비어 있을때까지
            boolean flag = false;
            Queue<Integer> queue2 = new LinkedList<>();
            while (!queue.isEmpty()) { // 뻗어 갈 수 있는 수를 큐2에 다 담는다.
                queue2.add(queue.poll());
            }
            while (!queue2.isEmpty()) { // 뻗어 갈 수 있는 수가 없을떄까지
                int end = queue2.poll();
                for (int i = 0; i < edges.length; i++) {
                    int[] edge = edges[i];
                    if (!visited[i]) { // 방문한적이 없을 경우
                        if (edge[0] == end) {  // 배옆 앞에 것이 이어지는 거라면 뒤에 것을 넣는다
                            queue.offer(edge[1]);
                            visited[i] = true;
                            flag = true;
                        } else if (edge[1] == end) { // 배옆 뒤에 값이 시작점 앞에 끝나는 수
                            queue.offer(edge[0]);
                            visited[i] = true;
                            flag = true;
                        }
                    }
                }
            }
            if (flag) {
                level++;
            }
        }
        return level;
    }

    /*public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();

        // Prepare adjacent list for each Node and count their degree.
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] degree = new int[n];
        for (int[] edge : edges) {

            List<Integer> adjList1 = adj.getOrDefault(edge[0], new ArrayList<>());
            adjList1.add(edge[1]);
            adj.put(edge[0], adjList1);
            degree[edge[0]]++;

            List<Integer> adjList2 = adj.getOrDefault(edge[1], new ArrayList<>());
            adjList2.add(edge[0]);
            adj.put(edge[1], adjList2);
            degree[edge[1]]++;
        }

        // Add node to queues which has degree 1.
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 1) {
                q.add(i);
                degree[i]--;
            }
        }

        // This is simple DFS applying on queue and removing one after another leaf node.
        while (!q.isEmpty()) {
            int size = q.size();
            result.clear();  // clear result on every iteration.
            for (int i = 0; i < size; i++) {
                int curr = q.poll(); // removing leaf node one after another
                result.add(curr);
                for (Integer neighbor : adj.get(curr)) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) {
                        q.add(neighbor);
                    }

                }
            }
        }

        if (n == 1) result.add(0);
        return result;
    }*/
}