package programmers.p81301;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");

        StringBuilder sb = new StringBuilder();
        String tmp = "";
        for (char c : s.toCharArray()) {
            tmp += c;
            if (Character.isDigit(c)) {
                sb.append(c);
                tmp = "";
            } else {
                if (list.contains(tmp)) {
                    sb.append(list.indexOf(tmp));
                    tmp = "";
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
