package leetcode.P290;

public class main {

    public static void main(String[] args) {
        String pattern1 = "abba";
        String str1 = "dog cat cat dog";
        Solution s = new Solution();
        System.out.println(s.wordPattern(pattern1, str1));

        String pattern2 = "abba";
        String str2 = "dog cat cat fish";
        System.out.println(s.wordPattern(pattern2, str2));

        String pattern3 = "aaaa";
        String str3 = "dog cat cat dog";
        System.out.println(s.wordPattern(pattern3, str3));

    }

}
