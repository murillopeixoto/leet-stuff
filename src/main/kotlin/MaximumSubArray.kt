package org.example

import kotlin.math.max
import kotlin.math.pow

/**
 * Solves problem: Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * Finds the contiguous subarray (containing at least one number) which has the largest sum and returns its sum.
 */
fun maxSubArray(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]
    var maxSum = -(10.toDouble().pow(4).toInt())
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        val slice = nums.slice(left..right)
        val tempMaxSum =
            if (slice.size == 2) {
                Math.max(slice[0] + slice[1], Math.max(slice[0], slice[1]))
            } else {
                nums.slice(left..right).sum()
            }
        maxSum = Math.max(maxSum, tempMaxSum)
        if (nums[left] == nums[right]) {
            if (nums[left + 1] > nums[right - 1]) {
                right -= 1
            } else {
                left += 1
            }
        } else if (nums[left] > nums[right]) {
            right -= 1
        } else {
            left += 1
        }
    }

    return maxSum
}

fun maxSubArrayB(nums: IntArray): Int {
    var maxSub = nums[0]
    var curSum = 0

    for (n in nums) {
        if (curSum < 0) curSum = 0
        curSum += n
        maxSub = max(maxSub, curSum)
    }

    return maxSub
}
