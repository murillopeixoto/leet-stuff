import org.example.isAnagram
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IsAnagramTest {
    @Test
    fun `case 1`() {
        assertTrue(isAnagram("anagram", "nagaram"))
    }

    @Test
    fun `case 2`() {
        assertFalse(isAnagram("rat", "car"))
    }

    @Test
    fun `case 3`() {
        assertFalse(isAnagram("ab", "a"))
    }
}
