package programmers.p131701;

import java.util.*;

public class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                int index = i + 1;
                int count = j;
                while (index != 0) {
                    sum += elements[(i + count++) % elements.length];
                    index--;
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
