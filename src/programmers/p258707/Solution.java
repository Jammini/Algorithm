package programmers.p258707;

import java.util.*;

public class Solution {
    public int solution(int coin, int[] cards) {
        int round = 0;
        int n = 0;
        int length = cards.length;
        Set<Integer> myCards = new HashSet<>();
        Set<Integer> addCards = new HashSet<>();

        // n 구하기
        for (int card : cards) {
            n = Math.max(n, card);
        }

        // 1/3 채우기
        for(int i = 0; i < length / 3; i++) {
            myCards.add(cards[i]);
        }

        for(int i = length / 3; i < length; i = i + 2) {
            boolean flag = true;
            round++;
            addCards.add(cards[i]);
            addCards.add(cards[i + 1]);

            // 내가 가진 카드들중에 n+1이 되는 카드가 있는지 확인
            for (int card : myCards) {
                int target = n + 1 - card;
                if (myCards.contains(target)) {
                    myCards.remove(target);
                    myCards.remove(card);
                    flag = false;
                    break;
                }
            }


            // coin 1개를 이용해서 내가가진 카드들로 되는지 확인
            if (flag && coin >= 1) {
                for (int card : addCards) {
                    int target = n + 1 - card;
                    if (myCards.contains(target)) {
                        myCards.remove(target);
                        addCards.remove(card);
                        coin--;
                        flag = false;
                        break;
                    }
                }
            }

            // coin 2개를 이용해서 봤던 카드들로 되는지 확인
            if (flag && coin >= 2) {
                for (int card : addCards) {
                    int target = n + 1 - card;
                    if (addCards.contains(target)) {
                        addCards.remove(target);
                        addCards.remove(card);
                        coin -= 2;
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                return round;
            }
        }
        if (myCards.isEmpty()) {
            round++;
        }
        return round;
    }
}
