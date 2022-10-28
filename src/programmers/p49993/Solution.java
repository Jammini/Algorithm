package programmers.p49993;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();

        for (String skill_tree : skill_trees) {
            boolean flag = true;
            for (char c : skill.toCharArray()) {
                queue.offer(c);
            }
            for (char c : skill_tree.toCharArray()) {
                if (queue.contains(c)) {
                    if (queue.peek() == c) {
                        queue.poll();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            queue.clear();
            if (flag) {
                answer++;
            }
        }
        return answer;
    }
}
