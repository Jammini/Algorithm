package programmers.p42626;

import java.util.*;

public class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public int solution(int[] scoville, int K) {
        int answer = 0;
        for (int sc : scoville) {
            pq.offer(sc);
        }

        while (scovilleCheck(K)) {
            if (pq.size() <= 1) {
                answer = -1;
                break;
            }

            int num1 = pq.poll();
            int num2 = pq.poll();
            pq.offer(scovilleRecipe(num1, num2));
            answer++;
        }
        return answer;
    }

    // scoville이 작은 두 수를 계산해서 리턴한다.
    public int scovilleRecipe(int num1, int num2) {
        return num1 + (num2 * 2);
    }

    // 스코빌 지수 K보다 낮은게 있는지 체크한다.
    public boolean scovilleCheck(int K) {
        for (int sc : pq) {
            if (sc < K) {
                return true;
            }
        }
        return false;
    }
}
