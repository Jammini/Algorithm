package leetcode.p139;

import java.util.*;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        while(!queue.isEmpty()) {
            String word = queue.poll();

            if(word.length() == s.length()) {
                return true;
            }

            for(String t : set) {
                if(s.length() < word.length() + t.length()) {
                    continue;
                }

                String literal = s.substring(word.length(), word.length() + t.length());
                if(set.contains(literal)) {
                    if(!visited.contains(word + literal)) {
                        visited.add(word + literal);
                        queue.offer(word + literal);
                    }
                }
            }
        }
        return false;
    }
}
