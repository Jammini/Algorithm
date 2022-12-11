package programmers.p12935;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        if (answer.length == 0) {
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}
