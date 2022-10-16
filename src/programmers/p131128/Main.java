package programmers.p131128;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("100","2345")); // "-1"
        System.out.println(new Solution().solution("100","203045")); // "0"
        System.out.println(new Solution().solution("100","123450")); // "10"
        System.out.println(new Solution().solution("12321","42531")); // "321"
        System.out.println(new Solution().solution("535125","121355")); // "552"
    }
}
