package programmers.p17681;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int bit = arr1[i] | arr2[i];
            String binary = Integer.toBinaryString(bit);
            String resultBit = binary.replace("1", "#").replace("0", " ");
            while (resultBit.length() < n) {
                resultBit = " " + resultBit;
            }
            answer[i] = resultBit;
        }
        return answer;
    }
}