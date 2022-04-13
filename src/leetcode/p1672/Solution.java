package leetcode.p1672;

public class Solution {
    public int maximumWealth(int[][] accounts) {

        int answer = 0;

        for (int i = 0; i < accounts.length; i++) {
            int price = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                 price += accounts[i][j];

            }
            if (answer < price){
                answer = price;
            }
        }

        return answer;
    }
}
