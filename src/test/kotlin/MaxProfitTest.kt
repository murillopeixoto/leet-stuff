import org.example.maxProfit
import kotlin.test.Test
import kotlin.test.assertEquals

class MaxProfitTest {
    @Test
    fun `test case 1`() {
        val actual = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))

        assertEquals(5, actual)
    }

    @Test
    fun `test case 2`() {
        val actual = maxProfit(intArrayOf(7, 6, 4, 3, 1))

        assertEquals(0, actual)
    }
}
