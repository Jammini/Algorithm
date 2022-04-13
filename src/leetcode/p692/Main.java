package leetcode.p692;

public class Main {
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};

        Solution s = new Solution();

        System.out.println(s.topKFrequent(words, 2));
    }
}
