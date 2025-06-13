package org.example

/**
 * Solves problem: Lemonade Change
 * https://leetcode.com/problems/lemonade-change/description/
 *
 * Checks if a lemonade stand can provide change for each customer based on the bills they pay with.
 */
fun lemonadeChange(bills: IntArray): Boolean {
    val standBills =
        mutableMapOf(
            20 to 0,
            10 to 0,
            5 to 0,
        )

    var hasChange = true
    bills.forEach { bill ->
        var change = bill - 5
        if (change != 0) {
            standBills.forEach {
                while (standBills.getValue(it.key) != 0 && it.key <= change) {
                    change -= it.key
                    standBills[it.key] = standBills.getValue(it.key) - 1
                }
            }
        }

        if (change != 0) {
            hasChange = false
            return@forEach
        }

        standBills[bill] = standBills.getValue(bill) + 1
    }

    return hasChange
}

fun lemonadeChangeOLD(bills: IntArray): Boolean {
    val standBills =
        mutableMapOf(
            5 to 0,
            10 to 0,
            20 to 0,
        )

    var hasChange = true
    bills.forEach { bill ->
        if (bill == 5) {
            standBills[bill] = standBills.getValue(5) + 1
        } else if (bill == 10) {
            standBills[bill] = standBills.getValue(10) + 1
            standBills[5] = standBills.getValue(5) - 1
        } else if (bill == 20) {
            standBills[20] = standBills.getValue(bill) + 1
            if (standBills.getValue(10) > 0) {
                standBills[10] = standBills.getValue(10) - 1
                standBills[5] = standBills.getValue(5) - 1
            } else {
                standBills[5] = standBills.getValue(5) - 3
            }
        }

        if (standBills.getValue(5) < 0) {
            hasChange = false
            return@forEach
        }
    }

    return hasChange
}
