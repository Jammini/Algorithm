package programmers.p340198;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{5, 3, 2},
            new String[][]{{"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}})); // 3
        System.out.println(new Solution().solution(new int[]{3},
            new String[][]{{"-1", "-1", "-1"}, {"-1", "-1", "-1"}, {"-1", "-1", "A"}})); // -1
    }
}
