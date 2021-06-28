package programmers.p12901;

public class Solution {
    public String solution(int a, int b) {
        String[] weeks = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = 0;
        for (int i = 0; i < a - 1; i++) {
            day += days[i];
        }
        day += b;

        return weeks[day % 7];
    }
}
