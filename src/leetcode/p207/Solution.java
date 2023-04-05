package leetcode.p207;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] pCounter = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            pCounter[prerequisite[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (pCounter[i] == 0) {
                queue.add(i);
            }
        }
        // 선수 과목이 없는 수업 수
        int numNoPre = queue.size();

        while (!queue.isEmpty()) {
            int top = queue.remove();
            for (int[] prerequisite : prerequisites) {
                // 대기열에 있는 수업이 선수과목을 조건이 맞을 경우
                if (prerequisite[1] == top) {
                    pCounter[prerequisite[0]]--;
                    if (pCounter[prerequisite[0]] == 0) {
                        numNoPre++;
                        queue.add(prerequisite[0]);
                    }
                }
            }
        }
        return numNoPre == numCourses;
    }
}
