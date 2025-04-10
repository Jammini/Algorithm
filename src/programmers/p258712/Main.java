package programmers.p258712;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"muzi", "ryan", "frodo", "neo"},
            new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi",
                "frodo muzi", "frodo ryan", "neo muzi"})); // 2
        System.out.println(
            new Solution().solution(new String[]{"joy", "brad", "alessandro", "conan", "david"},
                new String[]{"alessandro brad", "alessandro joy", "alessandro conan",
                    "david alessandro", "alessandro david"})); // 4
        System.out.println(new Solution().solution(new String[]{"a", "b", "c"},
            new String[]{"a b", "b a", "c a", "a c", "a c", "c a"})); // 0
    }
}
