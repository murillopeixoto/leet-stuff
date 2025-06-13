package org.example

/**
 * Solves problem: Valid Anagram
 * https://leetcode.com/problems/valid-anagram/description/
 *
 * Checks if two strings are anagrams of each other.
 */
fun isAnagram(
    s: String,
    t: String,
): Boolean {
    val sMap = mutableMapOf<Char, Int>()
    val tMap = mutableMapOf<Char, Int>()
    for (c in s) {
        sMap[c] = sMap.getOrDefault(c, 0).plus(1)
    }

    for (c in t) {
        tMap[c] = tMap.getOrDefault(c, 0).plus(1)
    }

    return sMap == tMap
}
