package programmers.p42587;

import java.util.*;

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
            queue2.offer(i);
        }
        int index = priorities[location];
        while (!queue.isEmpty()) {
            int max = queue.peek();
            boolean flag = true;
            for (int i = 0; i < queue.size(); i++) {
                if (max < queue.peek()) {
                    flag = false;
                    break;
                } else {
                    queue.offer(queue.poll());
                    queue2.offer(queue2.poll());
                }
            }
            if (flag) {
                int num = queue.poll();
                int loc = queue2.poll();
                answer++;
                if (index == num && location == loc){
                    return answer;
                }
            }
        }
        return answer;
    }
}
