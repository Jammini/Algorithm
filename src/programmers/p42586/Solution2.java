package programmers.p42586;

import java.util.*;

public class Solution2 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        int[] days =  new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
        }

        for (int i = 0; i < speeds.length; i++) {
            int day = progresses[i] / speeds[i];
            if (progresses[i] % speeds[i] != 0) {
                day++;
            }
            days[i] = day;
        }

        int count = 1;
        int max = days[0];
        for(int i=1; i< days.length; i++) {
            if (max >= days[i]) {
                count++;
            } else {
                answerList.add(count);
                count = 1;
                max = days[i];
            }
        }
        answerList.add(count);
        int[] answer = new int[answerList.size()];
        for (int i = 0; i <answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
