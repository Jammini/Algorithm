package programmers.p250125;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(
            new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}, 1, 1)); // 2
        System.out.println(new Solution().solution(
            new String[][]{{"yellow", "green", "blue"}, {"blue", "green", "yellow"},
                {"yellow", "blue", "blue"}}, 0, 1)); // 1
    }
}
