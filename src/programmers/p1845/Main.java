package programmers.p1845;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Solution2 s2 = new Solution2();
        Solution3 s3 = new Solution3();
        System.out.println(s.solution(new int[]{3, 1, 2, 3}));
        System.out.println(s.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(s.solution(new int[]{3, 3, 3, 2, 2, 2}));
        System.out.println(s2.solution(new int[]{3, 1, 2, 3}));
        System.out.println(s2.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(s2.solution(new int[]{3, 3, 3, 2, 2, 2}));
        System.out.println(s3.solution(new int[]{3, 1, 2, 3}));
        System.out.println(s3.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(s3.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}
