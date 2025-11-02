package org.example

/**
 * Solves Problem: Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * Finds the longest common prefix string among an array of strings.
 */
fun longestCommonPrefix(strs: Array<String>): String {
    val prefix = StringBuilder()
    var minLengthIndex = 0
    for (i in strs.indices) {
        if (strs[i].length < strs[minLengthIndex].length) {
            minLengthIndex = i
        }
    }
    loop@for (i in strs[minLengthIndex].indices) {
        val currentChar = strs[minLengthIndex][i]
        for (j in strs.indices) {
            if (strs[j][i] != currentChar) {
                break@loop
            }
        }
        prefix.append(currentChar)
    }

    return prefix.toString()
}
