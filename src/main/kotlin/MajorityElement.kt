package org.example

/**
 * Solves problem: Majority Element
 * https://leetcode.com/problems/majority-element/
 *
 * Finds the majority element in an array of integers.
 */
fun majorityElement(nums: IntArray): Int {
    val majorityList = mutableMapOf<Int, Int>()
    for (i in nums) {
        majorityList[i] = majorityList.getOrDefault(i, 0).plus(1)
    }
    var biggest = 0
    var repetitions = 0
    majorityList.forEach { index, value ->
        if (value > repetitions) {
            repetitions = value
            biggest = index
        }
    }

    return biggest
}
