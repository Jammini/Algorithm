package leetcode.p529;

import java.util.*;

public class Solution {
    int[] a = {-1, -1, 0, 1, 1, 1, 0, -1};
    int[] b = {0, 1, 1, 1, 0, -1, -1, -1};
    public char[][] updateBoard(char[][] board, int[] click) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(click);
        boolean[][] visited = new boolean[board.length][board[0].length];

        // 클릭한 곳이 바로 폭탄이면 X로 바꾸고 리턴
        if(board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        while(!queue.isEmpty()) {
            int[] currentClick = queue.poll();

            if(!visited[currentClick[0]][currentClick[1]]) {
                visited[currentClick[0]][currentClick[1]] = true;
            } else {
                continue;
            }

            int checkCount = checkBomb(board, currentClick);
            if(checkCount != 0) {
                board[currentClick[0]][currentClick[1]] = Character.forDigit(checkCount, 10);
            } else {
                board[currentClick[0]][currentClick[1]] = 'B';
                for(int i = 0; i < 8; i++) {
                    int x = currentClick[0] + a[i];
                    int y = currentClick[1] + b[i];
                    if(x >= 0 && x < board.length && y >= 0 && y < board[0].length && !visited[x][y]) {
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }
        return board;
    }

    public int checkBomb(char[][] board, int[] click) {
        int count = 0;
        for(int i = 0; i < 8; i++) {
            int x = click[0] + a[i];
            int y = click[1] + b[i];

            if(x >= 0 && x < board.length && y >= 0 && y < board[0].length) {
                if(board[x][y] == 'M') {
                    count++;
                }
            }
        }
        return count;
    }
}
