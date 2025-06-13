import org.example.largestNumber
import org.junit.jupiter.api.Disabled
import kotlin.test.Test
import kotlin.test.assertEquals

@Disabled
class LargestNumberTest {
    @Test
    fun `case 1`() {
        assertEquals("210", largestNumber(intArrayOf(10, 2)))
    }

    @Test
    fun `case 2`() {
        assertEquals("9534330", largestNumber(intArrayOf(3, 30, 34, 5, 9)))
    }
}
