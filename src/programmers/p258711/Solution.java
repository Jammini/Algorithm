package programmers.p258711;

import java.util.*;

public class Solution {
    // 도넛 모양 그래프 -> n인 크기, n개의 정점, n개 간선
    // 막대 모양 그래프 -> n인 크기, n개의 정점, n-1개의 간선
    // 8자 모양 그래프 -> n인 크기, 2n+1 정점, 2n+2 간선 
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        Map<Integer, Integer> inLine = new HashMap<>();
        Map<Integer, Integer> outLine = new HashMap<>();

        for(int[] edge : edges) {
            outLine.put(edge[0], outLine.getOrDefault(edge[0], 0) + 1);
            inLine.put(edge[1], inLine.getOrDefault(edge[1], 0) + 1);
        }

        // 정점 구하기
        for(int key : outLine.keySet()) {
            if(outLine.get(key) >= 2 && !inLine.containsKey(key)) {
                answer[0] = key;
            }
        }

        // 막대 모양 그래프 구하기
        for(int key : inLine.keySet()) {
            if(!outLine.containsKey(key)) {
                answer[2]++;
            }
        }

        // 8자 구하기
        for(int key : outLine.keySet()) {
            if(outLine.get(key) >= 2&& key != answer[0]) {
                answer[3]++;
            }
        }

        // 정점 out(총개수) = 총개수 - 막대모양 - 8자 -> 도넛모양 개수가 나온다
        answer[1] = outLine.get(answer[0]) - answer[2] - answer[3];
        return answer; // 0 : 생성한 정점의 번호, 1 : 도넛 모양 그래프의 수, 2 : 막대 모양 그래프의 수, 3 : 8자 모양 그래프의 수
    }
}
