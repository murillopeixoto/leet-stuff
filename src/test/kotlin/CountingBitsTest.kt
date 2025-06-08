import org.example.countBits
import kotlin.test.Test
import kotlin.test.assertEquals

class CountingBitsTest {
    @Test
    fun `case 1`() {
        assertEquals(intArrayOf(0, 1, 1).toList(), countBits(2).toList())
    }

    @Test
    fun `case 2`() {
        assertEquals(intArrayOf(0, 1, 1, 2, 1, 2).toList(), countBits(5).toList())
    }
}
