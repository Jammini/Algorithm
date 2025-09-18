package leetcode.p743;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4, 2)); // 2
        System.out.println(new Solution().networkDelayTime(new int[][]{{1,2,1}}, 2, 1)); // 1
        System.out.println(new Solution().networkDelayTime(new int[][]{{1,2,1}}, 2, 2)); // -1
    }
}
