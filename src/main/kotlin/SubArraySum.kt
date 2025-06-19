package org.example

fun subArraySum(
    numbers: List<Int>,
    listSize: Int,
    subArraySize: Int,
): Int {
    var max = 0
    var index = 0
    val subList = mutableListOf<Int>()
    while (index <= listSize - subArraySize) {
        for (position in 0 until subArraySize) {
            subList.add(numbers[index + position])
        }

        val subListSum = subList.sum()
        max = if (subListSum > max) subListSum else max
        index = index.inc()
        subList.clear()
    }

    return max
}

fun maxSlidingWindow(
    numbers: List<Int>,
    listSize: Int,
    subArraySize: Int,
): Int {
    var max = 0
    val subList = mutableListOf<Int>()
    for (number in numbers) {
        subList.add(number)
        if (subList.size == subArraySize) {
            val subListSum = subList.sum()
            if (subListSum > max) max = subListSum
            subList.removeAt(0)
        }
    }

    return max
}
