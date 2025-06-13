import org.example.lemonadeChange
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LemonadeChangeTest {
    @Test
    fun `case 1`() {
        assertTrue(lemonadeChange(intArrayOf(5, 5, 5, 10, 20)))
    }

    @Test
    fun `case 2`() {
        assertFalse(lemonadeChange(intArrayOf(5, 5, 10, 10, 20)))
    }

    @Test
    fun `case 3`() {
        assertFalse(lemonadeChange(intArrayOf(5, 5, 5, 5, 20, 20, 5, 5, 20, 5)))
    }
}
