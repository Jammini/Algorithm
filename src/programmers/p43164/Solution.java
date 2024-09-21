package programmers.p43164;

import java.util.*;

class Solution {
    boolean[] visited;
    List<String> list;
    public String[] solution(String[][] tickets) {
        list = new ArrayList<>();
        visited = new boolean[tickets.length];
        dfs(tickets, 0, "ICN", "ICN");

        Collections.sort(list);

        return list.get(0).split(",");
    }
    public void dfs(String[][] tickets, int level, String start, String path) {
        if(level == tickets.length) {
            list.add(path);
            return;
        } else {
            for(int i = 0; i < tickets.length; i++) {
                if(!visited[i] && start.equals(tickets[i][0])) {
                    visited[i] = true;
                    dfs(tickets, level + 1, tickets[i][1], path + "," + tickets[i][1]);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}})));
        System.out.println(Arrays.toString(solution.solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}})));
    }
}

