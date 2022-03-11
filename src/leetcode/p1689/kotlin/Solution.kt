package leetcode.p1689.kotlin

class Solution {
    fun minPartitions(n: String): Int {
        var answer = 0
        for (num in n) {
            if (answer < (num - '0')) {
                (num - '0').also { answer = it }
            }
        }
        return answer
    }
}