package leetcode.p1450;

public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int answer =0;

        for(int i =0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                answer++;
            }
        }

        return answer;

    }
}
