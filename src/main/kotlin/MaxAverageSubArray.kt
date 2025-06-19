package org.example

import kotlin.math.pow

/**
 * Solves problem: Maximum Average Subarray I
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 *
 * Finds the contiguous subarray of length k that has the maximum average value.
 */
fun findMaxAverage(
    nums: IntArray,
    k: Int,
): Double {
    var startIndex = 0
    var endIndex = k
    var sum = 0

    repeat(k) {
        sum += nums[it]
    }
    var maxSum = sum

    while (endIndex < nums.size) {
        sum -= nums[startIndex]
        startIndex++

        sum += nums[endIndex]
        endIndex++

        maxSum = maxOf(maxSum, sum)
    }

    return maxSum / k.toDouble()
}

fun findMaxAverageBrute(
    nums: IntArray,
    k: Int,
): Double {
    var maxAverage = -10.0.pow(4)
    var startIndex = 0
    var endIndex = k - 1
    while (endIndex < nums.size) {
        val average = nums.slice(startIndex..endIndex).average()
        maxAverage = maxOf(maxAverage, average)
        startIndex++
        endIndex++
    }
    return maxAverage
}

fun matchingStrings(
    stringList: Array<String>,
    queries: Array<String>,
): Array<Int> {
    val matches = mutableListOf<Int>()
    for (i in queries.indices) {
        matches[i] = 0
        for (j in stringList) {
            if (queries[i] == j) {
                matches[i] += 1
            }
        }
    }

    return matches.toTypedArray()
}
