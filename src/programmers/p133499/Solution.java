package programmers.p133499;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciation = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < pronunciation.length; j++) {
                babbling[i] = babbling[i].replace(pronunciation[j], "" + j);
            }
            char c = ' ';
            boolean flag = true;
            for (int j = 0; j < babbling[i].length(); j++) {
                if (!Character.isDigit(babbling[i].charAt(j)) || c == babbling[i].charAt(j)) {
                    flag = false;
                    break;
                } else {
                    c = babbling[i].charAt(j);
                }
            }
            if (flag) {
                answer++;
            }
        }
        return answer;
    }
}
