import org.example.minMeetingRooms
import kotlin.test.Test
import kotlin.test.assertEquals

class MeetingRoomsTest {
    @Test
    fun `case 1`() {
        assertEquals(
            2,
            minMeetingRooms(
                arrayOf(
                    intArrayOf(0, 30),
                    intArrayOf(5, 10),
                    intArrayOf(15, 20),
                ),
            ),
        )
    }

    @Test
    fun `case 2`() {
        assertEquals(
            1,
            minMeetingRooms(
                arrayOf(
                    intArrayOf(7, 10),
                    intArrayOf(2, 4),
                ),
            ),
        )
    }

    @Test
    fun `case 3`() {
        assertEquals(
            2,
            minMeetingRooms(
                arrayOf(
                    intArrayOf(5, 8),
                    intArrayOf(6, 8),
                ),
            ),
        )
    }
}
