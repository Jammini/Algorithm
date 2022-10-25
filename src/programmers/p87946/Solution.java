package programmers.p87946;

public class Solution {
    int answer = -1;
    boolean[] ch;

    public int solution(int k, int[][] dungeons) {
        ch = new boolean[dungeons.length];
        search(k, dungeons, 0);
        return answer;
    }

    public void search(int k, int[][] dungeons, int max) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!ch[i] && dungeons[i][0] <= k) {
                ch[i] = true;
                search(k - dungeons[i][1], dungeons, max + 1);
                ch[i] = false;
            }
            answer = Math.max(answer, max);
        }
    }
}
