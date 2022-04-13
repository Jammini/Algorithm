package programmers.p42627;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0; // 실행시간
        int joblength = jobs.length;
        int MAX = 2147483647;
        int endtime;

        // 정렬
        Arrays.sort(jobs, new Comparator<int[]>() {
            // Override된 compare 함수를 어떻게 정의하냐에 따라서 다양한 정렬이 가능해집니다
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }
            }
        });
        endtime = jobs[0][0];

        for (int i = 0; i < joblength; i++) {
            int starttmp = 0;
            int endtmp = MAX;
            int n = 0;
            int num = 0;

            while (n < joblength) {
                if (endtime >= jobs[n][0] && endtmp > jobs[n][1]) {
                    starttmp = jobs[n][0];
                    endtmp = jobs[n][1];
                    num = n;
                } else {
                    n++;
                }
                if (n >= joblength) {
                    jobs[num][0] = MAX;
                    jobs[num][1] = MAX;
                }
            } // while 종료


            if (endtmp == MAX) {
                i--;
                endtime = MAX;
                for (int w = 0; w < joblength; w++) {
                    if (endtime > jobs[w][0]) {
                        endtime = jobs[w][0];
                    }
                }
            } else {
                answer = answer + endtmp + (endtime - starttmp);
                endtime += endtmp;
            }
        } // for문 종료
        answer = answer / joblength;

        return answer;
    }
}