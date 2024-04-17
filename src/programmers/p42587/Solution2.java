package programmers.p42587;

import java.util.*;

public class Solution2 {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int priority : priorities) {
            queue.add(priority);
        }

        while (!queue.isEmpty()) {
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                // 현재 작업 위치 찾기
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    // 현재 작업하고 있는게 location과 같으면 answer 반환
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
