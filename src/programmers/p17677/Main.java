package programmers.p17677;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("FRANCE", "french")); // 16384
        System.out.println(new Solution().solution("handshake", "shake hands")); // 65536
        System.out.println(new Solution().solution("aa1+aa2", "AAAA12")); // 43690
        System.out.println(new Solution().solution("E=M*C^2", "e=m*c^2")); // 65536
        System.out.println(new Solution().solution("di mi mi mi mi", "di di di go")); // 8192
        System.out.println(new Solution().solution("abc", "abbb")); // 16384
        System.out.println(new Solution().solution("BAAAA", "AAA")); // 32768
    }
}
