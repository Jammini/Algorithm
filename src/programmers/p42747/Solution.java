package programmers.p42747;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int length = citations.length - i;
            int count = 0;
            for (int j = i; j < citations.length; j++) {
                if (citations[j] >= length) {
                    count++;
                }
            }
            if (length == count) {
                answer = length;
                break;
            }
        }
        return answer;
    }
}
