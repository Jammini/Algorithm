package programmers.p150369;

import java.util.Stack;

public class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        Stack<Integer> deliveryStack = new Stack<>();
        Stack<Integer> pickupStack = new Stack<>();
        long answer = 0;

        for (int i = 0; i < n; i++) {
            deliveryStack.push(deliveries[i]);
            pickupStack.push(pickups[i]);
        }

        // 둘 중 하나라도 참이면 계속 굴러간다.
        while (!deliveryStack.isEmpty() || !pickupStack.isEmpty()) {
            // 맨 끝이 0일 경우 계산할 필요 없으니 pop
            while (!deliveryStack.isEmpty() && deliveryStack.peek() == 0) {
                deliveryStack.pop();
            }
            while (!pickupStack.isEmpty() && pickupStack.peek() == 0) {
                pickupStack.pop();
            }
            answer += Math.max(deliveryStack.size(), pickupStack.size()) * 2L;

            int dTarget = 0;
            while (!deliveryStack.isEmpty()) {
                int dCurrent = deliveryStack.pop();

                if (dTarget + dCurrent <= cap) {
                    // 배달 가능
                    dTarget += dCurrent;
                } else {
                    // 배달 불가능
                    // 남은 배달 양 스택에 넣어주기
                    deliveryStack.push(dTarget + dCurrent - cap);
                    break;
                }
            }

            int pTarget = 0;
            while (!pickupStack.isEmpty()) {
                int pCurrent = pickupStack.pop();

                if (pTarget + pCurrent <= cap) {
                    pTarget += pCurrent;
                } else {
                    pickupStack.push(pTarget + pCurrent - cap);
                    break;
                }
            }
        }
        return answer;
    }
}
