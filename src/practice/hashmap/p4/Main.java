package practice.hashmap.p4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution(String word1, String word2) {
        int answer = 0;
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        for (char x : word2.toCharArray()) {
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }
        int length = word2.length() - 1;
        for (int i = 0; i < length; i++) {
            aMap.put(word1.charAt(i), aMap.getOrDefault(word1.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = length; rt < word1.length(); rt++) {
            aMap.put(word1.charAt(rt), aMap.getOrDefault(word1.charAt(rt), 0) + 1);
            if (aMap.equals(bMap))
                answer++;
            aMap.put(word1.charAt(lt), aMap.get(word1.charAt(lt)) - 1);
            if (aMap.get(word1.charAt(lt)) == 0) {
                aMap.remove(word1.charAt(lt));
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        System.out.println(T.solution(word1, word2));
    }
}
