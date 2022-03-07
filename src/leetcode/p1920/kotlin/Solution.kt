package leetcode.p1920.kotlin

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        for (i in nums.indices) {
            result[i] = nums[nums[i]]
        }
        return result
    }
}