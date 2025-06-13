import org.example.rob
import kotlin.test.Test
import kotlin.test.assertEquals

class RobTest {
    @Test
    fun `case 1`() {
        assertEquals(4, rob(intArrayOf(1, 2, 3, 1)))
    }

    @Test
    fun `case 2`() {
        assertEquals(12, rob(intArrayOf(2, 7, 9, 3, 1)))
    }

    @Test
    fun `case 3`() {
        assertEquals(4, rob(intArrayOf(2, 1, 1, 2)))
    }
}
