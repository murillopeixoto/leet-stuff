import org.example.wordBreak
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordBreakTest {
    @Test
    fun `case 1`() {
        assertTrue(wordBreak("leetcode", listOf("leet", "code")))
    }

    @Test
    fun `case 2`() {
        assertTrue(wordBreak("applepenapple", listOf("apple", "pen")))
    }

    @Test
    fun `case 3`() {
        assertFalse(wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
    }

    @Test
    fun `case 4`() {
        assertFalse(wordBreak("bb", listOf("a", "b", "bbb", "bbbb")))
    }
}
