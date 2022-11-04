package programmers.p1844;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int n;
    int m;
    int answer = 1;
    boolean flag = true;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        int[][] map = new int[n + 2][m + 2];

        for (int i = 0; i < maps.length; i++) {
            System.arraycopy(maps[i], 0, map[i + 1], 1, maps[0].length);
        }
        bfs(map);

        if (flag) {
            return -1;
        }
        return answer;
    }

    public void bfs(int[][] maps) {
        Queue<Node> queue = new LinkedList<>();
        int[] index1 = {1, -1, 0, 0};
        int[] index2 = {0, 0, 1, -1};
        Node node = new Node(1, 1);
        queue.offer(node);
        maps[node.x][node.y] = 0;

        label:
        while (!queue.isEmpty()) {
            answer++;
            Queue<Node> queue1 = new LinkedList<>();
            while (!queue.isEmpty()) {
                queue1.add(queue.poll());
            }
            while (!queue1.isEmpty()) {
                Node node1 = queue1.poll();
                for (int i = 0; i < index1.length; i++) {
                    int x = node1.x;
                    int y = node1.y;
                    if (maps[node1.x + index1[i]][node1.y + index2[i]] == 1) {
                        x += index1[i];
                        y += index2[i];
                        maps[x][y] = 0;
                        queue.offer(new Node(x, y));

                        if (x == n && y == m) {
                            flag = false;
                            break label;
                        }
                    }
                }
            }
        }
    }

/*    public void print(int maps[][]) {
        System.out.println("==============================");
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                System.out.print(maps[i][j] + " ");
            }
            System.out.println();
        }
    }*/

    /*

    class Solution {
    int n;
    int m;
    int answer = Integer.MAX_VALUE;
    boolean flag = false;

    public int solution(int[][] maps) {
        int[][] map = new int[maps.length + 2][maps[0].length + 2];
        n = maps.length;
        m = maps[0].length;

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                map[i + 1][j + 1] = maps[i][j];
            }
        }

        dfs(map, 1, 1, 0);
        if (!flag) {
            answer = -1;
        }
        return answer;
    }

    public void dfs(int[][] maps, int x, int y, int sum) {
        if (answer < sum) {
            return;
        }
        if (x == n && y == m) {
            flag = true;
            answer = Math.min(answer, ++sum);
            return;
        } else {
            maps[x][y] = 0;
            if (maps[x - 1][y] != 0) {
                dfs(maps, x - 1, y, sum + 1);
            }
            if (maps[x + 1][y] != 0) {
                dfs(maps, x + 1, y, sum + 1);
            }
            if (maps[x][y - 1] != 0) {
                dfs(maps, x, y - 1, sum + 1);
            }
            if (maps[x][y + 1] != 0) {
                dfs(maps, x, y + 1, sum + 1);
            }
            maps[x][y] = 1;
        }
    }
}
     */
}