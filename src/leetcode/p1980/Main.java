package leetcode.p1980;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().findDifferentBinaryString(new String[]{"01", "10"})); // 11
        System.out.println(new Solution().findDifferentBinaryString(new String[]{"00", "01"})); // 11
        System.out.println(new Solution().findDifferentBinaryString(new String[]{"111", "011", "001"})); // 101
    }
}
