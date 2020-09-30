package leetcode.P414;

import java.util.Arrays;
import java.util.Collections;

public class Solution2 {
    public int thirdMax(int[] nums) {
        Integer num[] = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(num, Collections.reverseOrder());

        int answer = num[0];
        int count = 1;
        for (int i = 1; i < num.length; i++) {
            if (answer > num[i]) {
                answer = num[i];
                count++;
            }
            if (count == 3) {
                break;
            }
        }
        if (count != 3) {
            answer = num[0];
        }

        return answer;
    }
}
