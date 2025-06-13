package org.example

/**
 * Solves problem: House Robber
 * https://leetcode.com/problems/house-robber/description/
 *
 * Determines the maximum amount of money that can be robbed without robbing two adjacent houses.
 */
fun rob(nums: IntArray): Int {
    var rob1 = 0
    var rob2 = 0
    for (i in nums) {
        val temp = Math.max(i + rob1, rob2)
        rob1 = rob2
        rob2 = temp
    }

    return rob2
}
