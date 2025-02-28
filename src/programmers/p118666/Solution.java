package programmers.p118666;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Character, Integer> map;
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        map = new HashMap<>(
            Map.of('R', 0, 'T', 0, 'C', 0, 'F', 0, 'J', 0, 'M', 0, 'A', 0, 'N', 0));

        for (int i = 0; i < survey.length; i++) {
            char[] chars = survey[i].toCharArray();
            if (choices[i] == 4) {
              continue;
            } else if (choices[i] < 4) {
                int score = 4 - choices[i];
                map.put(chars[0], map.get(chars[0]) + score);
            } else {
                int score = choices[i] - 4;
                map.put(chars[1], map.get(chars[1]) + score);
            }
        }
        answer = getAnswer();
        return answer;
    }

    private String getAnswer() {
        String answer = "";

        if(map.get('R') < map.get('T')) {
            answer += "T";
        } else {
            answer += "R";
        }

        if(map.get('C') < map.get('F')) {
            answer += "F";
        } else {
            answer += "C";
        }

        if (map.get('J') < map.get('M')) {
            answer += "M";
        } else {
            answer += "J";
        }

        if(map.get('A') < map.get('N')) {
            answer += "N";
        } else {
            answer += "A";
        }
        return answer;
    }
}
