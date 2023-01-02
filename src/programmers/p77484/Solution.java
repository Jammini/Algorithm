package programmers.p77484;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;
        Arrays.sort(lottos);
        List<Integer> list = new ArrayList<>();
        for (int win_num : win_nums) {
            list.add(win_num);
        }
        for (int lotto : lottos) {
            if (list.contains(lotto)) {
                count++;
            } else if (lotto == 0) {
                zeroCount++;
            }
        }
        answer[0] = rank[count + zeroCount];
        answer[1] = rank[count];
        return answer;
    }
}
