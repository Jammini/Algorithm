package programmers.p340213;

import java.time.Duration;

public class Solution {

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] dur = video_len.split(":");
        String[] now = pos.split(":");
        String[] ops = op_start.split(":");
        String[] ope = op_end.split(":");
        Duration duration = Duration.ofMinutes(Long.parseLong(dur[0])).plusSeconds(Long.parseLong(dur[1]));
        Duration nowTime = Duration.ofMinutes(Long.parseLong(now[0])).plusSeconds(Long.parseLong(now[1]));
        Duration opsTime = Duration.ofMinutes(Long.parseLong(ops[0])).plusSeconds(Long.parseLong(ops[1]));
        Duration opeTime = Duration.ofMinutes(Long.parseLong(ope[0])).plusSeconds(Long.parseLong(ope[1]));

        for (String command : commands) {
            if (nowTime.compareTo(opsTime) >= 0 && nowTime.compareTo(opeTime) < 0) {
                nowTime = opeTime;
            }
            if ("next".equals(command)) {
                if (nowTime.plusSeconds(10).compareTo(duration) >= 0) {
                    nowTime = duration;
                } else {
                    nowTime = nowTime.plusSeconds(10);
                }
            } else {
                // nowTime - 10초가 00:00초보다 작으면 00:00 초
                if (nowTime.minusSeconds(10).compareTo(Duration.ZERO) <= 0) {
                    nowTime = Duration.ZERO;
                } else {
                    nowTime = nowTime.minusSeconds(10);
                }
            }
        }

        if (nowTime.compareTo(opsTime) >= 0 && nowTime.compareTo(opeTime) < 0) {
            nowTime = opeTime;
        }

        long minutes = nowTime.toMinutes();
        long seconds = nowTime.minusMinutes(minutes).getSeconds();
        answer = String.format("%02d:%02d", minutes, seconds);
        return answer;
    }
}
