package leetcode.p139;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().wordBreak("leetcode", List.of("leet", "code"))); // true
        System.out.println(new Solution().wordBreak("applepenapple", List.of("apple","pen"))); // true
        System.out.println(new Solution().wordBreak("catsandog", List.of("cats","dog","sand","and","cat"))); // false
    }
}
