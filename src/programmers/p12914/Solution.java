package programmers.p12914;

public class Solution {
    /*long answer = 0;
    int target;

    public long solution(int n) {
        target = n;
        jump(1);
        jump(2);
        return answer % 1234567;
    }

    public void jump(int num) {
        if (num == target) {
            answer++;
            return;
        } else if (num > target) {
            return;
        } else {
            jump(num + 1);
            jump(num + 2);
        }
    }*/

    public long solution(int n) {
        long answer = 1;
        int[] num = new int[n + 2];
        num[1] = 1;
        num[2] = 2;

        for (int i = 3; i <= n; i++) {
            num[i] = (num[i - 2] + num[i - 1]) % 1234567;
        }
        answer = num[num.length - 2];
        return answer;
    }
}

