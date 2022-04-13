package programmers.p17678;

import java.util.Arrays;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        int[] minutetable = new int[timetable.length];

        Arrays.sort(timetable);

        // timetable에 있는 시간을 정렬하여 munutetable로 만들기
        for (int i = 0; i < timetable.length; i++) {
            minutetable[i] = Integer.parseInt(timetable[i].substring(0, 2)) * 60
                    + Integer.parseInt(timetable[i].substring(3, 5));
        }

        int firstbus = 540; // 09:00 첫차
        int count = 0;
        boolean numcheck = true; // true일 경우 버스에 태울 공간이 남음 , false 태울 공간 X

        for (int i = 0; i < n; i++) {
            numcheck = true;
            count = 0;
            for (int j = 0; j < timetable.length; j++) {
                if (firstbus >= minutetable[j] && !timetable[j].equals("x")) { // firstbus 이전에 기다리던 사람 and timetable[i]가 x가 아닌사람
                    timetable[j] = "x";
                    count++;
                }
                if (count >= m) {
                    numcheck = false;
                    break;
                }
            }
            firstbus = firstbus + t; // 다음 배차
        }

        // 대기열에 남아 있는 애들 체크
        boolean timecheck = true; // true이면 대기열에 남아있는 애들이 다 셔틀을탔음, false이면 대기열에 아직 애들이 남아있음
        int num = 0;

        for (int i = 0; i < timetable.length; i++) {
            if (!timetable[i].equals("x")) {
                timecheck = false;
                num = i;
                break;
            }
        }

        if (numcheck == true) { // 마지막 버스에 태울공간이 남았다
            num = firstbus - t;  // 마지막 버스를 탄다
        } else if (timecheck == false) { // 대기열에 남은 애들이 있는 경우
            num = num - 1;
            num = minutetable[num] - 1; // 마지막 탄 아이보다 1분더 빨리 줄을 서야한다.
        } else { // 둘다 해당 되지 않은 경우
            num = minutetable[minutetable.length - 1] - 1; // 마지막 대기열에 있는애보다 1분더 빨리 줄을 서야함.
        }

        // 시 분 변환
        int hour = num / 60;
        int minute = num % 60;

        // 한자리수 일경우 0붙여주기
        String hourstr = "";
        if (hour < 10) {
            hourstr = "0" + String.valueOf(hour);
        } else {
            hourstr = String.valueOf(hour);
        }

        String minutestr = "";
        if (minute < 10) {
            minutestr = "0" + String.valueOf(minute);
        } else {
            minutestr = String.valueOf(minute);
        }

        answer = hourstr + ":" + minutestr;

        return answer;
    }
}