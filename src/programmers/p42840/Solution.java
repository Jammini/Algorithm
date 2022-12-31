package programmers.p42840;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] peopleA = {1, 2, 3, 4, 5};
        int[] peopleB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] peopleC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];
        List<Integer> list = new ArrayList();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == peopleA[i % peopleA.length]) {
                count[0]++;
            }
            if (answers[i] == peopleB[i % peopleB.length]) {
                count[1]++;
            }
            if (answers[i] == peopleC[i % peopleC.length]) {
                count[2]++;
            }
        }
        int max = Math.max(count[0], Math.max(count[1], count[2]));

        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                list.add(i + 1);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
