package org.example

/**
 * Solves problem: Counting Bits
 * https://leetcode.com/problems/counting-bits/description/
 *
 * Counts the number of 1 bits in the binary representation of each number from 0 to n.
 */
fun countBits(n: Int): IntArray {
    val array = IntArray(n + 1)
    for (i in array.indices) {
        array[i] = i.countOneBits()
    }
    return array
}
