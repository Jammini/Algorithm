package programmers.p1844;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int no = -1;
        int answer = 1;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            answer++;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = node.x + dx[j];
                    int ny = node.y + dy[j];

                    if (nx == maps.length - 1 && ny == maps[0].length - 1) {
                        return answer;
                    }

                    if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] == 1 && visited[nx][ny] == false) {
                        queue.offer(new Node(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return no;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}})); // 11
        System.out.println(new Solution2().solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}})); // -1
    }
}
