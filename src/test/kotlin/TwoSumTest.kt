import org.example.twoSum
import org.example.twoSumBruteForce
import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class TwoSumTest {
    @Test
    fun `case 1`() {
        assertArrayEquals(intArrayOf(0, 1), twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `case 2`() {
        assertArrayEquals(intArrayOf(1, 2), twoSum(intArrayOf(3, 2, 4), 6))
    }

    @org.junit.jupiter.api.Test
    fun `case 3`() {
        assertArrayEquals(intArrayOf(0, 1), twoSum(intArrayOf(3, 3), 6))
    }

    @Test
    fun `case 1 brute force`() {
        assertArrayEquals(intArrayOf(0, 1), twoSumBruteForce(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `case 2 brute force`() {
        assertArrayEquals(intArrayOf(1, 2), twoSumBruteForce(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun `case 3 brute force`() {
        assertArrayEquals(intArrayOf(0, 1), twoSumBruteForce(intArrayOf(3, 3), 6))
    }
}
