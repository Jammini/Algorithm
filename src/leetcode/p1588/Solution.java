package leetcode.p1588;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int answer = 0;

        for (int i = 1; i <= arr.length; i = i + 2) {
            for (int j = 0; j < arr.length; j++) {
                int end = i+j;
                if (end > arr.length){
                    end = arr.length;
                    break;
                }
                for (int k = j; k < end ; k++) {
                    answer += arr[k];
                }
            }
        }
        return answer;
    }
}
