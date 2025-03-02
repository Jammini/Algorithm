package programmers.p72410;

public class Solution {
    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder();

        // 1. 소문자로 치환
        answer = new StringBuilder(new_id.toLowerCase());

        // 2. 소문자, 숫자, -, _, . 제외한 문자 제거
        answer = new StringBuilder(answer.toString().replaceAll("[^a-z0-9-_.]", ""));

        // 3. .. -> .
        answer = new StringBuilder(answer.toString().replaceAll("\\.{2,}", "."));

        // 4. 처음과 끝에 . 제거
        answer = new StringBuilder(answer.toString().replaceAll("^\\.|\\.$", ""));

        // 5. 빈 문자열이면 a 대입
        if (answer.length() == 0) {
            answer = new StringBuilder("a");
        }

        // 6. 16자 이상이면 15자로 자르고 마지막이 .이면 제거
        if (answer.length() >= 16) {
            answer = new StringBuilder(answer.substring(0, 15));
            answer = new StringBuilder(answer.toString().replaceAll("\\.$", ""));
        }

        // 7. 2자 이하면 마지막 문자를 3이 될 때까지 반복
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer.append(answer.charAt(answer.length() - 1));
            }
        }
        return answer.toString();
    }
}
