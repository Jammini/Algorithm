package programmers.p388351;

public class Solution {

    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        boolean[] week = {true, true, true, true, true, false, false};

        for (int j = 0; j < timelogs.length; j++) {
            boolean flag = false;
            int day = startday - 1;
            int schedule = schedules[j] + 10;

            if (schedule % 100 >= 60) { // 60분 초과시 시간 계산
                schedule = schedule + 100 - 60;
            }

            for (int k = 0; k < timelogs[j].length; k++) {
                if (day >= 7) {
                    day = day - 7;
                }

                if (schedule < timelogs[j][k] && week[day]) { // 지각을 했다면 체크
                    flag = true;
                    break;
                }
                day++;
            }

            if (!flag) { // 지각 안한 인원 추가
                answer++;
            }
        }
        return answer;
    }
}
