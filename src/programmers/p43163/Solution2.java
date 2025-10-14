package programmers.p43163;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution2 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(Arrays.asList(words));

        if (!set.contains(target)) {
            return 0;
        }

        queue.offer(begin);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                // 타겟이면 변환 횟수 반환
                if (current.equals(target)) {
                    return answer;
                }

                // 현재 단어와 한 글자만 다른 단어들을 큐에 추가
                for (String word : set) {
                    if (diffStr(current, word)) {
                        queue.offer(word);
                    }
                }
            }
            answer++;
        }
        return answer;
    }

    public boolean diffStr(String start, String word) {
        int count = 0;
        for (int j = 0; j < word.length(); j++) {
            if (start.charAt(j) != word.charAt(j)) {
                count++;
            }
        }
        return count == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"})); // 4
        System.out.println(new Solution2().solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"})); // 0
    }
}
