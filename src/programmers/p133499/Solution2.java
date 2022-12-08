package programmers.p133499;

public class Solution2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciation = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            if (b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")) {
                continue;
            }
            for (String p : pronunciation) {
                b = b.replace(p, " ");
            }
            if (b.trim().length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}
