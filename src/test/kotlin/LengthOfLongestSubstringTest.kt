import org.example.lengthOfLongestSubstring
import kotlin.test.Test
import kotlin.test.assertEquals

class LengthOfLongestSubstringTest {
    @Test
    fun `test 1`() {
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun `test 2`() {
        assertEquals(1, lengthOfLongestSubstring("bbbbb"))
    }

    @Test
    fun `test 3`() {
        assertEquals(3, lengthOfLongestSubstring("pwwkew"))
    }

    @Test
    fun `test 4`() {
        assertEquals(2, lengthOfLongestSubstring("aab"))
    }

    @Test
    fun `test 5`() {
        assertEquals(3, lengthOfLongestSubstring("dvdf"))
    }
}
