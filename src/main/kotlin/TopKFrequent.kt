package org.example

/**
 * Solves problem: Top K Frequent Elements
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 *
 * Finds the k most frequent elements in an array of integers.
 */
fun topKFrequent(
    nums: IntArray,
    k: Int,
): IntArray {
    val frequency: MutableMap<Int, Int> = mutableMapOf()
    for (i in nums.indices) {
        if (!frequency.containsKey(nums[i])) {
            frequency[nums[i]] = 0
        }
        frequency[nums[i]] = frequency[nums[i]]!! + 1
    }

    val topFrequentArray = IntArray(k)
    val frequents = frequency.toList().sortedByDescending { (_, value) -> value }.take(k).map { it.first }
    for (i in frequents.indices) {
        topFrequentArray[i] = frequents[i]
    }
    return topFrequentArray
}
