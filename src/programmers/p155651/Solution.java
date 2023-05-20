package programmers.p155651;

import java.util.Arrays;

public class Solution {
    public int solution(String[][] book_time) {
        int[] rooms = new int[24 * 60 + 10];

        for (String[] bt : book_time) {
            String inTime = bt[0];
            String outTime = bt[1];

            for (int i = saveMinute(inTime); i < saveMinute(outTime) + 10; i++) {
                rooms[i]++;
            }
        }
        Arrays.sort(rooms);
        return rooms[rooms.length - 1];
    }

    private int saveMinute(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]) * 60;
        int minute = Integer.parseInt(split[1]);
        return hour + minute;
    }
}
