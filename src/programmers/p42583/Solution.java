package programmers.p42583;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int answer = 0;
        int truckWeightSum = 0;

        for (int truck_weight : truck_weights) {
            queue1.offer(truck_weight);
        }

        while (!queue1.isEmpty()) {
            answer++;
            if (answer > bridge_length) {
                truckWeightSum -= queue2.poll();
            }

            if (truckWeightSum + queue1.peek() <= weight) {
                int x = queue1.poll();
                truckWeightSum += x;
                queue2.offer(x);
            } else {
                queue2.offer(0);
            }
        }
        answer += bridge_length;
        return answer;
    }
}
