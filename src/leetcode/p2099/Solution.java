package leetcode.p2099;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Number implements Comparable<Number> {
    int index;
    int num;

    public Number(int index, int num) {
        this.index = index;
        this.num = num;
    }

    @Override
    public int compareTo(Number o) {
        return o.num - this.num;
    }
}

public class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] answer = new int[k];
        List<Number> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(new Number(i, nums[i]));
        }

        Collections.sort(list);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).index;
        }
        Arrays.sort(answer);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = nums[answer[i]];
        }
        return answer;
    }
}
