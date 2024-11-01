package programmers.p42628;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> reversePq = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            String[] temp = operation.split(" ");
            String front = temp[0];
            int num = Integer.parseInt(temp[1]);
            if ("I".equals(front)) {
                pq.offer(num);
                reversePq.offer(num);
            } else if ("D".equals(front)) {
                if (num == 1 && !pq.isEmpty()) {
                    Integer poll = reversePq.poll();
                    pq.remove(poll);
                } else if (num == -1 && !pq.isEmpty()) {
                    Integer poll = pq.poll();
                    reversePq.remove(poll);
                }
            }
        }
        if (!pq.isEmpty() && !reversePq.isEmpty()) {
            answer[0] = reversePq.peek();
            answer[1] = pq.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}))); // [0,0]
        System.out.println(Arrays.toString(s.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}))); // [333,-45]
    }
}
