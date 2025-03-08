package programmers.p150370;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate now = LocalDate.parse(today, formatter);

        for (String term : terms) {
            String[] split = term.split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            LocalDate localDate = LocalDate.parse(split[0], formatter);
            int num = map.get(split[1]);

            if (num >= 12) {
                localDate = localDate.plusYears(1);
                num -= 12;
            }
            localDate = localDate.plusMonths(num);
            localDate = localDate.minusDays(1);
            while (localDate.getDayOfMonth() > 28) {
                localDate = localDate.minusDays(1);
            }
            if (now.isAfter(localDate)) {
                list.add(i + 1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
