import org.example.findMaxAverage
import kotlin.test.Test
import kotlin.test.assertEquals

class MaxAverageSubArrayTest {
    @Test
    fun `test 1`() {
        assertEquals(12.7500, findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4))
    }

    @Test
    fun `test 2`() {
        assertEquals(5.0, findMaxAverage(intArrayOf(5), 1))
    }
}
