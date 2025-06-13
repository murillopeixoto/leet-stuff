import org.example.numIslands
import org.junit.jupiter.api.Disabled
import kotlin.test.Test
import kotlin.test.assertEquals

@Disabled("To be fixed")
class NumIslandsTest {
    @Test
    fun `case 1`() {
        assertEquals(
            1,
            numIslands(
                arrayOf(
                    charArrayOf('1', '1', '1', '1', '0'),
                    charArrayOf('1', '1', '0', '1', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '0', '0', '0'),
                ),
            ),
        )
    }

    @Test
    fun `case 2`() {
        assertEquals(
            3,
            numIslands(
                arrayOf(
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '1', '0', '0'),
                    charArrayOf('0', '0', '0', '1', '1'),
                ),
            ),
        )
    }
}
