package programmers.p142086;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            answer[i] = map.containsKey(s.charAt(i)) ? i - map.get(s.charAt(i)) : -1;
            map.put(s.charAt(i), i);
        }
        return answer;
    }
}
