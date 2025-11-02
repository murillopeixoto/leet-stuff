package org.example

/**
 * Solve problem: Two Sum
 * https://leetcode.com/problems/two-sum/description/
 *
 * Finds indices of two numbers in an array that add up to a specific target.
 */
fun twoSum(
    nums: IntArray,
    target: Int,
): IntArray {
    val numToIndex = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val difference = target - nums[i]
        if (numToIndex.contains(difference)) {
            return intArrayOf(numToIndex[difference]!!, i)
        }
        numToIndex[nums[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}

fun twoSumBruteForce(
    nums: IntArray,
    target: Int,
): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException("No two sum solution")
}
