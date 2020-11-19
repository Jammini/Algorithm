package programmers.P17680;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<String>();

        for (int i = 0; i < cities.length; i++) {
            if (queue.contains(cities[i].toLowerCase())) { // hit일 경우
                answer = answer + 1;
                queue.remove(cities[i].toLowerCase());
                queue.add(cities[i].toLowerCase());
            } else {   // miss일 경우
                answer = answer + 5;
                queue.add(cities[i].toLowerCase());
                if (queue.size() > cacheSize) {
                    queue.poll();
                }
            }
        }
        return answer;
    }
}