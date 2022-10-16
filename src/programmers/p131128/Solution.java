package programmers.p131128;

import java.util.*;

public class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> map1 = new HashMap();
        List<String> list = new ArrayList<>();
        String[] yArr = Y.split("");
        for (String s : yArr) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        String[] xArr = X.split("");
        Arrays.sort(xArr);

        for (int i = xArr.length - 1; i >= 0 ; i--) {
            if (map1.containsKey(xArr[i]) && map1.get(xArr[i]) > 0) {
                list.add(xArr[i]);
                map1.put(xArr[i], map1.get(xArr[i]) - 1);
            }
        }
        if (list.size() == 0) {
            return "-1";
        }
        for (String s : list) {
            if (list.get(0).equals("0")) {
                answer.append("0");
                break;
            } else {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}
