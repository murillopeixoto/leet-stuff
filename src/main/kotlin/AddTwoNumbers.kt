package org.example

/**
 * Solves problem: Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * Adds two numbers represented by linked lists and returns the sum as a linked list.
 *
 */
fun addTwoNumbers(
    l1: ListNode?,
    l2: ListNode?,
): ListNode? {
    if (l1 == null || l2 == null) {
        return null
    }

    val listOfNodes = mutableListOf<ListNode>()
    var currentL1 = l1
    var currentL2 = l2
    var carry = 0
    do {
        var added = currentL1!!.`val`.plus(currentL2!!.`val`).plus(carry)
        carry = 0
        if (added >= 10) {
            carry = 1
            added %= 10
        }
        listOfNodes.add(ListNode(added))
        currentL1 = currentL1.next
        currentL2 = currentL2.next
    } while (currentL1 != null && currentL2 != null)

    for (i in listOfNodes.size - 1 downTo 1) {
        listOfNodes[i - 1].next = listOfNodes[i]
    }

    return listOfNodes[0]
}

fun addTwoNumbersB(
    l1: ListNode?,
    l2: ListNode?,
): ListNode? {
    if (l1 == null || l2 == null) {
        return null
    }

    var n1 = l1
    var n2 = l2
    var carryOver = 0
    var added = n2.`val`.plus(n1.`val`)
    if (added >= 10) {
        added %= 10
        carryOver = 1
    }
    val newNode = ListNode(added)
    var currentNode: ListNode?
    while (n1?.next != null && n2?.next != null) {
        n1 = n1.next
        n2 = n2.next
        added = n2!!.`val`.plus(n1!!.`val`).plus(carryOver)
        carryOver = 0
        if (added >= 10) {
            added %= 10
            carryOver = 1
        }
        currentNode = ListNode(added)
        newNode.next = currentNode
    }
    return newNode
}
