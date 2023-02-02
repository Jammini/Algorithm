package leetcode.p565;

public class Solution {
    int answer = 0;
    boolean[] visited;

    public int arrayNesting(int[] nums) {
        visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            visited[i] = true;
            dfs(nums, nums[i], 1);
        }
        return answer;
    }

    private void dfs(int[] nums, int num, int count) {
        if (visited[num]) {
            answer = Math.max(answer, count);
            return;
        }
        visited[num] = true;
        dfs(nums, nums[num], count + 1);
    }
}
