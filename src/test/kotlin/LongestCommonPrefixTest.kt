import org.example.longestCommonPrefix
import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTest {
    @Test
    fun `case 1`() {
        assertEquals("fl", longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    }

    @Test
    fun `case 2`() {
        assertEquals("", longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    }
}
