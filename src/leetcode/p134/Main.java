package leetcode.p134;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2})); // 3
        System.out.println(new Solution().canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3})); // -1
    }
}
