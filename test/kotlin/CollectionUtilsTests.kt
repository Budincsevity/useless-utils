
import CollectionUtils.sleepSort
import org.testng.annotations.Test

class CollectionUtilsTests {

    @Test
    fun testSleepSort() {
        val preSorted = listOf(1L, 2L, 3L, 4L, 5L)
        val sleepSorted = sleepSort(listOf(5, 4, 3, 2, 1))
        print(sleepSorted)
        assert(preSorted == sleepSorted)
    }

}