import org.example.productExceptSelf
import kotlin.test.Test
import kotlin.test.assertContentEquals

class ProductExceptSelfTest {
    @Test
    fun `cases 1`() {
        val actual = productExceptSelf(intArrayOf(1, 2, 3, 4))
        assertContentEquals(intArrayOf(24, 12, 8, 6), actual)
    }

    @Test
    fun `cases 2`() {
        val actual = productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))
        assertContentEquals(intArrayOf(0, 0, 9, 0, 0), actual)
    }

    @Test
    fun `cases 3`() {
        val actual = productExceptSelf(intArrayOf(2, 3, 5, 0))
        assertContentEquals(intArrayOf(0, 0, 0, 30), actual)
    }
}
