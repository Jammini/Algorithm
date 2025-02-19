package programmers.p159994;

public class Main {

    public static void main(String[] args) {
        System.out.println(
            new Solution().solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"})); // "Yes"
        System.out.println(
            new Solution().solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"})); // "No"
    }
}
