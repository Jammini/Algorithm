package programmers.p43163;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    Queue<String> queue;
    int answer = 0;

    public int solution(String begin, String target, String[] words) {
        boolean flag = false;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                flag = true;
            }
        }
        if (!flag) {
            return 0;
        }
        queue = new LinkedList<>();
        queue.offer(begin);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String start = queue.poll();
                if (start.equals(target)) {
                    return answer;
                }
                diffStr(start, words);
            }
            answer++;
        }
        return answer;
    }

    public void diffStr(String start, String[] words) {
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (start.charAt(j) != words[i].charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                queue.offer(words[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"})); // 4
        System.out.println(new Solution().solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"})); // 0
    }
}