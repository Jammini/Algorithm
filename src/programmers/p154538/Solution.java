package programmers.p154538;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.offer(x);
        set.add(x);
        while (!queue.isEmpty()) {
            if (set.contains(y)) {
                return answer;
            }
            answer++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int val = queue.poll();
                if (val * 2 <= y && !set.contains(val * 2)) {
                    queue.offer(val * 2);
                    set.add(val * 2);
                }
                if (val * 3 <= y && !set.contains(val * 3)) {
                    queue.offer(val * 3);
                    set.add(val * 3);
                }
                if (val + n <= y && !set.contains(val + n)) {
                    queue.offer(val + n);
                    set.add(val + n);
                }
            }
        }
        return -1;
    }
}
