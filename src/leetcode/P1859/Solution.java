package leetcode.P1859;

public class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();

        String[] sliceStr = s.split(" ");
        String[] answerArr = new String[sliceStr.length];

        for (int i = 0; i < sliceStr.length; i++) {
            answerArr[Integer.parseInt(sliceStr[i].substring(sliceStr[i].length() - 1)) - 1] = sliceStr[i].substring(0, sliceStr[i].length() - 1);
        }

        for (int i = 0; i < answerArr.length; i++) {
            sb.append(answerArr[i] + " ");
        }

        return sb.toString().trim();
    }
}
