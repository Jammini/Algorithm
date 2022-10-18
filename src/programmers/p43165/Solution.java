package programmers.p43165;

public class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    public void dfs(int[] numbers, int target, int sum, int L) {
        if (sum == target && numbers.length == L) {
            answer++;
        }
        if (numbers.length - 1 < L) {
            return;
        } else {
            dfs(numbers, target, sum + numbers[L], L + 1);
            dfs(numbers, target, sum - numbers[L], L + 1);
        }
    }
}
