package practice.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public char solution(int num, String words) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char w : words.toCharArray()) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt(); // 15
        String input2 = in.next(); // BACBACCACCBDEDE
        System.out.println(T.solution(input1, input2));
    }
}
