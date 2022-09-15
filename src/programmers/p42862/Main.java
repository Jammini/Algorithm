package programmers.p42862;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, new int[]{2, 4}, new int[]{1, 3, 5})); // 5
        System.out.println(s.solution(5, new int[]{2, 4}, new int[]{3})); // 4
        System.out.println(s.solution(3, new int[]{3}, new int[]{1})); // 2
        System.out.println(s.solution(7, new int[]{2, 4, 7}, new int[]{1, 3, 5})); // 6
        System.out.println(s.solution(5, new int[]{1, 2}, new int[]{2, 3})); // 4
    }
}
