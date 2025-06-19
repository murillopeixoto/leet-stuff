package org.example

import kotlin.math.max

fun maxProfit(prices: IntArray): Int {
    var left = 0
    var right = 1
    var profit = 0

    while (right < prices.size) {
        if (prices[left] < prices[right]) {
            profit = max(prices[right] - prices[left], profit)
        } else {
            left = right
        }
        right = right.inc()
    }

    return profit
}
