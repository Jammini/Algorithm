package leetcode.p36;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!isWidthCheck(i, board) || !isHeightCheck(i, board)) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board.length; j = j + 3) {
                if (!isSquareCheck(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isWidthCheck(int x, char[][] board) {
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < board.length; j++) {
            if (Character.isDigit(board[x][j]) && set.contains(board[x][j])) {
                return false;
            }
            set.add(board[x][j]);
        }
        return true;
    }

    private boolean isHeightCheck(int y, char[][] board) {
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < board.length; j++) {
            if (Character.isDigit(board[j][y]) && set.contains(board[j][y])) {
                return false;
            }
            set.add(board[j][y]);
        }
        return true;
    }

    private boolean isSquareCheck(int x, int y, char[][] board) {
        Set<Character> set = new HashSet<>();
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (Character.isDigit(board[i][j]) && set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        return true;
    }
}
