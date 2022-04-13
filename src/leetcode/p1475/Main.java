package leetcode.p1475;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] price1 = {8, 4, 6, 2, 3};
        int[] price2 = {1, 2, 3, 4, 5};
        int[] price3 = {10, 1, 1, 6};

        System.out.println(s.finalPrices(price1));
        System.out.println(s.finalPrices(price2));
        System.out.println(s.finalPrices(price3));
    }
}
