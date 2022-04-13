package leetcode.p1431;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(s.kidsWithCandies(candies, extraCandies).toString());
    }
}
