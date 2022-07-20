package practice.hashmap.p2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public String solution(String word1, String word2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char x : word1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for (char x : word2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        for (char key : map1.keySet()) {
            if (map1.get(key) != map2.get(key)) {
                answer = "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.next(); // AbaAeCe
        String input2 = in.next(); // baeeACA
        System.out.println(T.solution(input1, input2));
    }
}
