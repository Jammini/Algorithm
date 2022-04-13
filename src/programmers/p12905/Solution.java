package programmers.p12905;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        int row = board.length;
        int col = board[0].length;
        int max = 0;
        for (int i = 0; i < row; i++) {
            if (IntStream.of(board[i]).anyMatch(x -> x == 1)) {
                max = 1;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (board[i][j] != 0 && board[i - 1][j - 1] != 0 && board[i - 1][j] != 0 && board[i][j - 1] != 0) {
                    board[i][j] = (Math.min(board[i - 1][j - 1], Math.min(board[i - 1][j], board[i][j - 1]))) + 1;
                }

                if (max < board[i][j]) {
                    max = board[i][j];
                }
            }
        }

        answer = max * max;

        return answer;
    }
}