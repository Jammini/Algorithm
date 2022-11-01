package programmers.p17686;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    static class File {
        public String head;
        public String number;
        public String tail;

        File(String head, String number, String tail) {
            this.head = head;
            this.number = number;
            this.tail = tail;
        }

        public String getHead() {
            return head.toLowerCase();
        }

        public int getNumber() {
            return Integer.parseInt(number);
        }
    }

    public String[] solution(String[] files) {
        List<File> list = new ArrayList<>();

        for (String file : files) {
            int index = 0;
            int numStart = 0;
            int numEnd = 0;
            boolean flag = true;
            for (char c : file.toCharArray()) {
                if (flag && Character.isDigit(c)) {
                    numStart = index;
                    flag = false;
                } else if (!flag && !Character.isDigit(c)) {
                    numEnd = index;
                    break;
                }
                index++;
            }
            numEnd = numEnd == 0 ? file.length() : numEnd;
            list.add(new File(file.substring(0, numStart), file.substring(numStart, numEnd), file.substring(numEnd)));
        }

        list.sort(Comparator.comparing(File::getHead).thenComparing(File::getNumber));

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).head + list.get(i).number + list.get(i).tail;
        }
        return answer;
    }
}