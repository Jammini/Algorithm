package programmers.p389480;

import java.util.*;

public class Solution {

    int nOriginal;
    int mOriginal;
    int answer = Integer.MAX_VALUE;
    Set<String> set;
    public int solution(int[][] info, int n, int m) {
        set = new HashSet<>();
        nOriginal = n;
        mOriginal = m;
        boolean[] visited = new boolean[info.length];
        dfs(info, visited, n, m, 0);
        if(answer == Integer.MAX_VALUE) {
            return -1;
        }
        return answer;
    }
    public void dfs(int[][] info, boolean[] visited, int n, int m, int level) {

        if(n <= 0 || m <= 0) {
            return;
        }

        if(level == info.length && n > 0 && m > 0) {
            answer = Math.min(answer, nOriginal - n);
        }

        String memo = level + "-" + n + "-" + m;
        if(set.contains(memo)) {
            return;
        }
        set.add(memo);

        for(int i = 0; i < info.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(info, visited, n - info[i][0], m, level + 1); // A가 훔친 경우
                dfs(info, visited, n, m - info[i][1], level + 1); // B가 훔친 경우
                visited[i] = false;
            }
        }
    }
}
