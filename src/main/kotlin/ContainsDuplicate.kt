package org.example

/**
 * Solves problem: Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * Checks if there are any duplicates in the given array of integers.
 *
 */
fun containsDuplicate(nums: IntArray): Boolean {
    val hash = nums.toHashSet()
    return nums.size != hash.size
}
