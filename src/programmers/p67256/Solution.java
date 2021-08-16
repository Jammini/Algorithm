package programmers.p67256;

public class Solution {
    public String solution(int[] numbers, String hand) {
        int leftHand = 10;
        int rightHand = 12;
        StringBuilder sb = new StringBuilder();

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                leftHand = num;
                sb.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                rightHand = num;
                sb.append("R");
            } else {
                if (num == 0) {
                    num = 11;
                }
                int calculateLeft = Math.abs(num - leftHand);
                int calculateRight = Math.abs(num - rightHand);

                int leftNum = calculateLeft / 3 + calculateLeft % 3;
                int rightNum = calculateRight / 3 + calculateRight % 3;

                if (leftNum == rightNum) {
                    if (hand.equals("right")) {
                        rightHand = num;
                        sb.append("R");
                    } else {
                        leftHand = num;
                        sb.append("L");
                    }
                } else if (leftNum > rightNum) {
                    rightHand = num;
                    sb.append("R");
                } else if (leftNum < rightNum) {
                    leftHand = num;
                    sb.append("L");
                }
            }
        }
        return sb.toString();
    }
}
