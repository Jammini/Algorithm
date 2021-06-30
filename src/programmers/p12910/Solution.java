package programmers.p12910;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) list.get(i);
        }
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
