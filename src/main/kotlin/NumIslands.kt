package org.example

/**
 * Solves problem: Number of Islands
 * https://leetcode.com/problems/number-of-islands/description/
 *
 * Counts the number of islands in a 2D grid where '1' represents land and '0' represents water.
 */
fun numIslands(grid: Array<CharArray>): Int {
    var numIslands = 0
    if (grid.isEmpty()) return numIslands
    val lastRow = grid.lastIndex
    val lastColumn = grid[0].lastIndex
    val visited: MutableSet<Pair<Int, Int>> = mutableSetOf()
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.addLast(0 to 0)
    while (queue.isNotEmpty()) {
        val node = queue.removeFirst()
        if (!visited.contains(node) && grid[node.first][node.second] == '1') {
            numIslands += 1
        }
        visited.add(node)
        if (grid[node.first][node.second] == '1') {
            val subQueue = ArrayDeque<Pair<Int, Int>>()
            if (node.first + 1 <= lastRow) {
                subQueue.addLast(node.first + 1 to node.second)
            }
            if (node.second + 1 <= lastColumn) {
                subQueue.addLast(node.first to node.second + 1)
            }
            while (subQueue.isNotEmpty()) {
                val sameIslandNode = subQueue.removeFirst()
                if (visited.contains(sameIslandNode)) {
                    continue
                }
                visited.add(sameIslandNode)
                if (grid[sameIslandNode.first][sameIslandNode.second] == '0') {
                    continue
                }
                if (sameIslandNode.first - 1 >= 0) {
                    subQueue.addLast(sameIslandNode.first - 1 to sameIslandNode.second)
                }
                if (sameIslandNode.second - 1 >= 0) {
                    subQueue.addLast(sameIslandNode.first to sameIslandNode.second - 1)
                }
                if (sameIslandNode.first + 1 <= lastRow) {
                    subQueue.addLast(sameIslandNode.first + 1 to sameIslandNode.second)
                }
                if (sameIslandNode.second + 1 <= lastColumn) {
                    subQueue.addLast(sameIslandNode.first to sameIslandNode.second + 1)
                }
            }
        }

        if (node.first + 1 <= lastRow && !queue.contains(node.first + 1 to node.second)) {
            queue.addLast(node.first + 1 to node.second)
        }
        if (node.second + 1 <= lastColumn && !queue.contains(node.first to node.second + 1)) {
            queue.addLast(node.first to node.second + 1)
        }
    }

    return numIslands
}
