package org.example

/**
 * Solves problem: Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/description/
 *
 * Finds the maximum area of water that can be contained between two lines
 *
 */
object ContainerWithMostWater {
    fun maxAreaBrute(height: IntArray): Int {
        var maxArea = 0
        for (leftIndex in 0..<height.lastIndex) {
            for (rightIndex in leftIndex + 1..height.lastIndex) {
                val width = rightIndex - leftIndex
                val minHeight = Math.min(height[leftIndex], height[rightIndex])
                maxArea = Math.max(maxArea, minHeight * width)
            }
        }
        return maxArea
    }

    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var leftIndex = 0
        var rightIndex = height.size - 1
        while (leftIndex < rightIndex) {
            val width = rightIndex - leftIndex
            val minHeight = Math.min(height[leftIndex], height[rightIndex])
            maxArea = Math.max(maxArea, width * minHeight)
            if (height[leftIndex] > height[rightIndex]) {
                rightIndex = rightIndex.dec()
            } else {
                leftIndex = leftIndex.inc()
            }
        }

        return maxArea
    }
}
