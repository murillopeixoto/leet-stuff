package org.example

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    fun print(): String {
        if (next != null) {
            return "$`val` -> ${next?.print()}"
        } else {
            return "$`val`"
        }
    }
}
