package org.example

/**
 * Solves problem: Word Break
 * https://leetcode.com/problems/word-break/
 *
 * Determines if a string can be segmented into a space-separated sequence of one or more dictionary words.
 */
fun wordBreak(
    s: String,
    wordDict: List<String>,
): Boolean {
    var tempText = s
    var i = 0
    while (tempText.isNotEmpty()) {
        if (!tempText.startsWith(wordDict[i])) {
            break
        }
        tempText = tempText.substring(wordDict[i].length)
        i++
        if (i > wordDict.size - 1) {
            i = 0
        }
    }
    return tempText.isEmpty()
}
