package programmers.p17682;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1S2D*3T")); // 37
        System.out.println(s.solution("1D2S#10S")); // 9
        System.out.println(s.solution("1D2S0T")); // 3
        System.out.println(s.solution("1S*2T*3S")); // 23
        System.out.println(s.solution("1D#2S*3S")); // 5
        System.out.println(s.solution("1T2D3D#")); // -4
        System.out.println(s.solution("1D2S3T*")); // 59
    }
}
