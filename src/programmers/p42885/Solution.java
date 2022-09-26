package programmers.p42885;

import java.util.*;

public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();

        for (int person : people) {
            deque.offer(person);
        }

        int sum = 0;
        while (!deque.isEmpty()) {
            if (sum + deque.peek() > limit) {
                answer++;
                sum = 0;
            } else if (sum == 0){
                sum = deque.pollLast();
            } else {
                sum += deque.pollFirst();
            }
        }
        if (sum > 0) {
            answer++;
        }

        return answer;
    }
}
