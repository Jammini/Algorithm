package leetcode.p2011.kotlin

class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var answer: Int = 0
        for (operation in operations) {
            if (operation == "X++" || operation == "++X") {
                answer++
            } else {
                answer--
            }
        }
        return answer;
    }
}