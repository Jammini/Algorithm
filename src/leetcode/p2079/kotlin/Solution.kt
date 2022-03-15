package leetcode.p2079.kotlin

class Solution {
    fun wateringPlants(plants: IntArray, capacity: Int): Int {
        var answer = 0
        var water = capacity

        plants.forEachIndexed { index, plant ->
            if (water >= plant) {
                water -= plant
                answer++
            } else {
                water = capacity - plant
                answer += index * 2 + 1
            }
        }
        return answer
    }
}