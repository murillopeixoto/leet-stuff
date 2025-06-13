import org.example.topKFrequent
import kotlin.test.Test
import kotlin.test.assertEquals

class TopKFrequentTest {
    @Test
    fun `test case1`() {
        assertEquals(intArrayOf(1, 2).toList(), topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2).toList())
    }

    @Test
    fun `test case2`() {
        assertEquals(intArrayOf(1).toList(), topKFrequent(intArrayOf(1), 1).toList())
    }
}
