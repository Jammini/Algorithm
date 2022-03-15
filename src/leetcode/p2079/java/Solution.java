package leetcode.p2079.java;

public class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int answer = 0;
        int water = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (water >= plants[i]) {
                water -= plants[i];
                answer++;
            } else {
                water = capacity - plants[i];
                answer += (i * 2)  + 1;
            }
        }
        return answer;
    }
}
