package leetcode.p1929.kotlin

class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(nums.size * 2)
        for (i in result.indices) {
            result[i] = nums[if (i < nums.size) i else i - nums.size]
        }
        return result
    }
}