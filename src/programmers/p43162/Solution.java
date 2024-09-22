package programmers.p43162;

class Solution {
    boolean[] visited;
    int answer = 0;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        for(int i = 0; i < computers.length; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i, computers);
            }
        }
        
        return answer;
    }
    public void dfs(int x, int[][] computers) {
        visited[x] = true;
        for(int i = 0; i < computers.length; i++) {
            if(!visited[i] && computers[x][i] == 1) {
                dfs(i, computers);
            }    
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(new Solution().solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
    }
}