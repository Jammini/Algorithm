package programmers.p150365;

import java.util.*;

public class Solution {
    List<String> list = new ArrayList<>();
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        String answer = "";
        dfs(n, m, x - 1, y - 1, r - 1, c - 1, k, "");

        if (list.isEmpty()) {
            return "impossible";
        }

        Collections.sort(list);
        return list.get(0);
    }

    public void dfs(int n, int m, int x, int y, int r, int c, int k, String s) {
        int distance = Math.abs(x - r) + Math.abs(y - c);
        if (distance > k || distance % 2 != k % 2 || !list.isEmpty()) {
            return;
        }

        if (k <= 0) {
            if (x == r && y == c) {
                list.add(s);
            }
            return;
        }

        if (x + 1 < n) {
            dfs(n, m, x + 1, y, r, c, k - 1, s + "d");
        }

        if (y - 1 >= 0) {
            dfs(n, m, x, y - 1, r, c, k - 1, s + "l");
        }

        if (y + 1 < m) {
            dfs(n, m, x, y + 1, r, c, k - 1, s + "r");
        }

        if (x - 1 >= 0) {
            dfs(n, m, x - 1, y, r, c, k - 1, s + "u");
        }
    }
}
