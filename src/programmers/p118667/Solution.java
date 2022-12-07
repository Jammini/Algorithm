package programmers.p118667;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        Queue<Integer> q1 = new LinkedList();
        Queue<Integer> q2 = new LinkedList();

        long q1Sum = 0;
        for (int i : queue1) {
            q1.offer(i);
            q1Sum += i;
        }

        long q2Sum = 0;
        for (int i : queue2) {
            q2.offer(i);
            q2Sum += i;
        }
        if ((q1Sum + q2Sum) % 2 != 0) {
            return answer;
        }

        int count = 0;
        while (true) {
            if (count > (q1.size() + q2.size()) * 2) {
                break;
            }

            if (q1Sum > q2Sum) {
                int tmp = q1.poll();
                q2.offer(tmp);
                q1Sum -= tmp;
                q2Sum += tmp;
            } else if (q1Sum < q2Sum) {
                int tmp = q2.poll();
                q1.offer(tmp);
                q2Sum -= tmp;
                q1Sum += tmp;
            } else {
                break;
            }
            count++;
        }
        if (count > (q1.size() + q2.size()) * 2) {
            return -1;
        }
        answer = count;
        return answer;
    }
}
