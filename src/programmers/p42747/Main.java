package programmers.p42747;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution((new int[]{3, 0, 6, 1, 5}))); // 3
        System.out.println(new Solution().solution((new int[]{9, 7, 6, 2, 1}))); // 3
        System.out.println(new Solution().solution((new int[]{2, 3, 4, 5}))); // 3
        System.out.println(new Solution().solution((new int[]{0}))); // 0
        System.out.println(new Solution().solution((new int[]{1}))); // 1
        System.out.println(new Solution().solution((new int[]{10000}))); // 1
        System.out.println(new Solution().solution((new int[]{10000, 20000, 30000}))); // 3
        System.out.println(new Solution().solution((new int[]{0, 1, 2, 3, 4}))); // 2
        System.out.println(new Solution().solution((new int[]{0, 1, 2, 2, 3, 3, 4}))); // 3
        System.out.println(new Solution().solution((new int[]{0, 1, 3, 4, 5}))); // 3
        System.out.println(new Solution().solution((new int[]{0, 1, 2, 3}))); // 2
        System.out.println(new Solution().solution((new int[]{0, 1, 3, 4, 7, 8}))); // 3
        System.out.println(new Solution().solution((new int[]{4, 4, 4}))); // 3
    }
}