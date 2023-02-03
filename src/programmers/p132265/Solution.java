package programmers.p132265;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> setL = new HashSet<>();
        Set<Integer> setR = new HashSet<>();
        int[] countL = new int[topping.length - 1];
        int[] countR = new int[topping.length - 1];

        for (int i = 0; i < topping.length - 1; i++) {
            setL.add(topping[i]);
            countL[i] = setL.size();
        }

        for (int i = topping.length - 1; i > 0; i--) {
            setR.add(topping[i]);
            countR[i - 1] = setR.size();
        }

        for (int i = 0; i < countL.length; i++) {
            if (countL[i] == countR[i]) {
                answer++;
            }
        }
        return answer;
    }
}
