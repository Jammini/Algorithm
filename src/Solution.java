public class Solution {

    public static int[] finalPrices(int[] prices) {

        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            result[i] = prices[i];
        }

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.print(result[i] + " ");
        }

        return result;
    }


    public static void main(String[] args) {

        int[] price1 = {8, 4, 6, 2, 3};
        int[] price2 = {1, 2, 3, 4, 5};
        int[] price3 = {10, 1, 1, 6};


        System.out.println(finalPrices(price1));
        System.out.println(finalPrices(price2));
        System.out.println(finalPrices(price3));
    }
}

