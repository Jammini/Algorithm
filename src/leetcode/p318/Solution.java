package leetcode.p318;

import java.util.*;

public class Solution {
    public int maxProduct(String[] words) {
        int answer = 0;

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            Set<Character> set = new HashSet<>();

            for(int l = 0; l < word.length(); l++) {
                set.add(word.charAt(l));
            }

            for(int j = i + 1; j < words.length; j++) {
                boolean check = false;
                for(int k = 0; k < words[j].length(); k++) {
                    if(set.contains(words[j].charAt(k))) {
                        check = true;
                        break;
                    }
                }
                if(!check) {
                    answer = Math.max(answer, word.length() * words[j].length());
                }
            }
        }
        return answer;
    }
}
