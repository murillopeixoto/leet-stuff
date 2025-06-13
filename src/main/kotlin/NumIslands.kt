package org.example

import java.util.stream.IntStream.range

/**
 * Solves problem: Number of Islands
 * https://leetcode.com/problems/number-of-islands/description/
 *
 * Counts the number of islands in a 2D grid where '1' represents land and '0' represents water.
 */
fun numIslands(grid: Array<CharArray>): Int {
    var numIslands = 0
    if (grid.isEmpty()) return numIslands
    val rows = grid.size
    val cols = grid[0].size
    val visited: MutableSet<Pair<Int, Int>> = mutableSetOf<Pair<Int, Int>>()

    for (row in range(0, rows)) {
        for (col in range(0, cols)) {
            if ((grid[row][col] == '1') && !visited.contains(row to col)) {
                numIslands++
            }
        }
    }

    return numIslands
}
