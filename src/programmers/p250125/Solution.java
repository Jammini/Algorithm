package programmers.p250125;

public class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        String target = board[h][w];

        for(int i = 0; i < 4; i++) {
            if(h + dh[i] >= 0 && h + dh[i] < board.length &&
                   w + dw[i] >= 0 && w + dw[i] < board[0].length &&
                   target.equals(board[h + dh[i]][w + dw[i]])) {
                answer++;
            }
        }
        return answer;
    }
}
