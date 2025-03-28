package programmers.p161990;

public class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[0] = Integer.MAX_VALUE;
        answer[1] = Integer.MAX_VALUE;
        answer[2] = Integer.MIN_VALUE;
        answer[3] = Integer.MIN_VALUE;

        for(int i = 0; i < wallpaper.length; i++) {
            char[] wp = wallpaper[i].toCharArray();
            for(int j = 0; j < wp.length; j++) {
                if(wp[j] == '#') {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i + 1);
                    answer[3] = Math.max(answer[3], j + 1);
                }
            }
        }
        return answer;
    }
}
