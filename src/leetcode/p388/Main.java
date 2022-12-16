package leetcode.p388;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext")); // 20
        System.out.println(new Solution().lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext")); // 32
        System.out.println(new Solution().lengthLongestPath("a")); // 0
        System.out.println(new Solution().lengthLongestPath("dir\n        file.txt")); // 16
        System.out.println(new Solution().lengthLongestPath("a\n\taa\n\t\taaa\n\t\t\tfile1.txt\naaaaaaaaaaaaaaaaaaaaa\n\tsth.png")); // 29
    }
}