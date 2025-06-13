package org.example

/**
 * Solves problem: Palindrome Number
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * Checks if an integer is a palindrome.
 */

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    val a = x.toString()
    val b = StringBuilder()
    for (i in a.length - 1 downTo 0) {
        b.append(a[i])
    }

    return a == b.toString()
}
