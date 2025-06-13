package org.example

/**
 * Solves problem: Largest Number
 * https://leetcode.com/problems/largest-number/description/
 *
 * Constructs the largest number possible from an array of non-negative integers.
 */
fun largestNumber(nums: IntArray): String {
    val largestNumber = StringBuilder()
    var key = 0
    while (key < nums.size - 1) {
        largestNumber.append(nums[key])
        key++
    }

    return largestNumber.toString()
}
