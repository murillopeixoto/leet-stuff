import org.example.isPalindrome
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IsPalindromeTest {
    @Test
    fun `case 1`() {
        assertTrue(isPalindrome(121))
    }

    @Test
    fun `case 2`() {
        assertFalse(isPalindrome(-121))
    }

    @Test
    fun `case 3`() {
        assertFalse(isPalindrome(10))
    }
}
