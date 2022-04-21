package programmers.p68644;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet set = new HashSet();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < set.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
