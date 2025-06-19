import org.example.maxSlidingWindow
import org.example.subArraySum
import kotlin.test.Test
import kotlin.test.assertEquals

class SubArraySumTest {
    @Test
    fun `get biggest subarray sum`() {
        val expected = 24

        val numbers = listOf(1, 4, 2, 10, 2, 3, 1, 0, 20)
        val listSize = numbers.size
        val subArraySize = 4

        val actual = subArraySum(numbers, listSize, subArraySize)

        assertEquals(expected, actual)
    }

    @Test
    fun `get biggest subarray sum with maxSlidingWindow`() {
        val expected = 24

        val numbers = listOf(1, 4, 2, 10, 2, 3, 1, 0, 20)
        val listSize = numbers.size
        val subArraySize = 4

        val actual = maxSlidingWindow(numbers, listSize, subArraySize)

        assertEquals(expected, actual)
    }
}
