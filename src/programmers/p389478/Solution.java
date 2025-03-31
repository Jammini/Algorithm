package programmers.p389478;

public class Solution {

    public int solution(int n, int w, int num) {
        int numLevel = (num - 1) / w; // num Level 구하기
        int totalLevel = n / w; // total Level 구하기
        int divN = n % w; // m 나머지
        int divNum = num % w; // num 나머지
        divNum = divNum == 0 ? w : divNum; // 나머지가 0이면 w로 바꿔준다

        if (divN == 0) { // 나머지가 없으면 그냥 빼준다
            return totalLevel - numLevel;
        }

        if (totalLevel % 2 == 0) { // 짝수면 왼 -> 오
            if (numLevel % 2 == 0) { // 짝수면 왼 -> 오
                if (divN >= divNum) {
                    totalLevel++;
                }
            } else { // 홀수면 오 -> 왼
                if (w - divN < divNum) {
                    totalLevel++;
                }
            }
        } else { // 홀수면 오 -> 왼
            if (numLevel % 2 == 0) { // 짝수면 왼 -> 오
                if (w - divN < divNum) {
                    totalLevel++;
                }
            } else { // 홀수면 오 -> 왼
                if (divN >= divNum) {
                    totalLevel++;
                }
            }
        }
        return totalLevel - numLevel;
    }
}
