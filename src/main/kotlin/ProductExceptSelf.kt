package org.example

/**
 * Solves problem: Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/
 *
 * Calculates the product of all elements in an array except for the element at the current index.
 */
fun productExceptSelf(nums: IntArray): IntArray {
    val products = IntArray(nums.size)
    var key = 0
    while (key < nums.size - 1) {
        products[key] = nums[key + 1]
        key++
    }
    products[key] = nums[0]

    for (i in products.indices) {
        for (j in nums.indices) {
            if (i == j) continue
            if (i == products.indices.last && j == 0) continue
            if (j == i + 1) continue
            products[i] = products[i] * nums[j]
        }
    }

    return products
}
