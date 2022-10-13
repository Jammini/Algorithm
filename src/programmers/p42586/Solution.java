package programmers.p42586;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList();

        // 남은 작업일 계산
        for (int i = 0; i < progresses.length; i++) {
            int remainder = (100 - progresses[i]) % speeds[i] == 0 ? 0 : 1;
            progresses[i] = (100 - progresses[i]) / speeds[i] + remainder;
        }

        // 리스트에 일자별로 카운트를 센다.
        int count = 1;
        int tmp = progresses[0];
        for (int i = 1; i < progresses.length; i++) {
            if (tmp < progresses[i]) {
                list.add(count);
                count = 1;
                tmp = progresses[i];
            } else {
                count++;
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
