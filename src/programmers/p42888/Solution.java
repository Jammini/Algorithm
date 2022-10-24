package programmers.p42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String s : record) {
            String[] rec = s.split(" ");
            String state = rec[0];
            String uId = rec[1];
            String nickName = "";
            if (!"Leave".equals(state)) {
                nickName = rec[2];
            }

            if ("Enter".equals(state)) {
                map.put(uId, nickName);
                list.add(state + " " + uId);
            } else if ("Leave".equals(state)) {
                list.add(state + " " + uId);
            } else if ("Change".equals(state)) {
                map.put(uId, nickName);
            } else {
                throw new IllegalArgumentException();
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String[] str = list.get(i).split(" ");
            if ("Enter".equals(str[0])) {
                answer[i] = map.get(str[1]) + "님이 들어왔습니다.";
            } else if ("Leave".equals(str[0])) {
                answer[i] = map.get(str[1]) + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}
