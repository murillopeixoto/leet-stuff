
import org.example.maxSubArray
import org.example.maxSubArrayB
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MaximumSubArrayTest {
    @Test
    fun `test 1`() {
        assertEquals(6, maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun `test 2`() {
        assertEquals(1, maxSubArray(intArrayOf(1)))
    }

    @Test
    fun `test 3`() {
        assertEquals(23, maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
    }

    @Test
    fun `test 4`() {
        assertEquals(-2, maxSubArrayB(intArrayOf(-5, -2, -7)))
    }
}
