package programmers.p150368;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<int[]> list;
    static int[] discounts = {10, 20, 30, 40};

    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        list = new ArrayList<>();
        int maxSubscription = Integer.MIN_VALUE;
        int maxSumPrice = Integer.MIN_VALUE;
        combi(0, emoticons.length, 0, new int[emoticons.length]);

        for (int k = 0; k < list.size(); k++) {
            int userSubscription = 0;
            int userSumPrice = 0;
            for (int i = 0; i < users.length; i++) {
                int sum = 0;
                int[] discount = list.get(k);
                for (int j = 0; j < emoticons.length; j++) {
                    if (users[i][0] <= discount[j]) {
                        sum += emoticons[j] - emoticons[j] * discount[j] / 100;
                    }
                }
                if (sum >= users[i][1]) {
                    userSubscription++;
                    sum = 0;
                }
                userSumPrice += sum;
            }

            if (userSubscription > maxSubscription) {
                maxSubscription = userSubscription;
                maxSumPrice = userSumPrice;
            } else if (userSubscription == maxSubscription && userSumPrice > maxSumPrice) {
                maxSumPrice = userSumPrice;
            }
        }
        answer[0] = maxSubscription;
        answer[1] = maxSumPrice;
        return answer;
    }

    public void combi(int idx, int size, int depth, int[] arr) {
        if (size == depth) {
            int[] temp = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            list.add(temp);
            return;
        }

        for (int i = 0; i < 4; i++) {
            arr[idx] = discounts[i];
            combi(idx + 1, size, depth + 1, arr);
        }
    }
}
