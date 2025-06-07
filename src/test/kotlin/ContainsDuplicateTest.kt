import org.example.containsDuplicate
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateTest {
    @Test
    fun `case 1`() {
        assertTrue(containsDuplicate(intArrayOf(1, 2, 3, 1)))
    }

    @Test
    fun `case 2`() {
        assertFalse(containsDuplicate(intArrayOf(1, 2, 3, 4)))
    }

    @Test
    fun `case 3`() {
        assertTrue(containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
    }
}
