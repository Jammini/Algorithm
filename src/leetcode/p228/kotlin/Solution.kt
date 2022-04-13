package leetcode.p228.kotlin

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val list = ArrayList<String>()
        var num = 0

        for (i in nums.indices) {
            var checkIndex = if (i + 1 < nums.size) i + 1 else nums.size - 1
            if (nums[i] + 1 != nums[checkIndex]) {
                if (num == i) {
                    list.add("" + nums[i]);
                } else {
                    list.add("" + nums[num] + "->" + nums[i])
                }
                num = i + 1
            }
        }
        return list
    }
}