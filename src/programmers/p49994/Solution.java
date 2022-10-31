package programmers.p49994;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        int row = 0;
        int column = 0;

        for (char c : dirs.toCharArray()) {
            String start = String.format("%d%d", column, row);
            if (c == 'U') {
                column++;
            } else if (c == 'D') {
                column--;
            } else if (c == 'L') {
                row--;
            } else if (c == 'R') {
                row++;
            }
            if (column > 5) {
                column--;
                continue;
            } else if (column < -5) {
                column++;
                continue;
            } else if (row > 5) {
                row--;
                continue;
            } else if (row < -5) {
                row++;
                continue;
            }
            String end = String.format("%d%d", column, row);
            set.add(start + end);
            set.add(end + start);
        }
        return set.size() / 2;
    }
}
