import org.example.ContainerWithMostWater.maxArea
import org.example.ContainerWithMostWater.maxAreaBrute
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ContainerWithMostWaterTest {
    @Test
    fun `test 1 brute`() {
        assertEquals(49, maxAreaBrute(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    }

    @Test
    fun `test 2 brute`() {
        assertEquals(1, maxAreaBrute(intArrayOf(1, 1)))
    }

    @Test
    fun `test 1`() {
        assertEquals(49, maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    }

    @Test
    fun `test 2`() {
        assertEquals(1, maxArea(intArrayOf(1, 1)))
    }
}
