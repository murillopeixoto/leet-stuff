package org.example

fun lengthOfLongestSubstring(s: String): Int {
    val differentLetters = mutableSetOf<Char>()
    var longestSubString = 0
    var left = 0
    for (right in s.indices) {
        while (s[right] in differentLetters) {
            differentLetters.remove(s[left])
            left++
        }
        differentLetters.add(s[right])
        longestSubString = maxOf(longestSubString, right - left + 1)
    }
    return longestSubString
}
