import org.example.ListNode
import org.example.addTwoNumbers
import kotlin.test.Test
import kotlin.test.assertEquals

class AddTwoNumbersTest {
    @Test
    fun `case 1`() {
        val expected = "7 -> 0 -> 8"
        val nodeL11 = ListNode(2)
        val nodeL12 = ListNode(4)
        val nodeL13 = ListNode(3)

        nodeL11.next = nodeL12
        nodeL12.next = nodeL13

        val nodeL21 = ListNode(5)
        val nodeL22 = ListNode(6)
        val nodeL23 = ListNode(4)

        nodeL21.next = nodeL22
        nodeL22.next = nodeL23

        val result = addTwoNumbers(nodeL11, nodeL21)
        assertEquals(expected, result?.print())
    }
}