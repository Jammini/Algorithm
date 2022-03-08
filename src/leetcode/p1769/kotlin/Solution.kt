package leetcode.p1769.kotlin

import kotlin.math.abs

class Solution {
    fun minOperations(boxes: String): IntArray {
        val list = mutableListOf<Int>()
        val resultArray = IntArray(boxes.length)

        for (box in boxes.indices) {
            if (boxes[box] == '1') {
                list.add(box);
            }
        }
        for (box in boxes.indices) {
            for (l in list) {
                println(abs(box - l))
                resultArray[box] += abs(box - l)
            }
        }
        return resultArray
    }
}