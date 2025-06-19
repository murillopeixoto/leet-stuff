package org.example

/**
 * Solves problem: Meeting Rooms I
 * https://leetcode.com/problems/meeting-rooms/
 *
 * Determines the minimum number of meeting rooms required to hold all meetings given their start and end times.
 */
fun minMeetingRooms(intervals: Array<IntArray>): Int {
    var result = 0
    var numOfRooms = 0
    val starts = intervals.map { it[0] }.sorted()
    val ends = intervals.map { it[1] }.sorted()

    var startIndex = 0
    var endIndex = 0
    while (startIndex < intervals.size) {
        if (starts[startIndex] < ends[endIndex]) {
            startIndex++
            numOfRooms++
        } else {
            endIndex++
            numOfRooms--
        }
        result = Math.max(result, numOfRooms)
    }

    return result
}
