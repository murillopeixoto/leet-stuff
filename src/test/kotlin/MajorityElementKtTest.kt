import org.example.majorityElement
import kotlin.test.Test
import kotlin.test.assertEquals

class MajorityElementKtTest {
    @Test
    fun `case 1`() {
        assertEquals(3, majorityElement(intArrayOf(3, 2, 3)))
    }

    @Test
    fun `case 2`() {
        assertEquals(2, majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    }
}
