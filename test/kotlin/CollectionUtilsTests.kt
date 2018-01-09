
import CollectionUtils.sleepSort
import org.testng.annotations.Test

class CollectionUtilsTests {

    @Test
    fun testShuffleSort() {
        val preSorted = listOf(1, 2, 3, 4, 5)
        val shuffleSorted = CollectionUtils.shuffleSort(listOf(5, 4, 3, 2, 1))
        print(shuffleSorted)
        assert(preSorted == shuffleSorted)
    }

    @Test
    fun testSleepSort() {
        val preSorted = listOf(1L, 2L, 3L, 4L, 5L)
        val sleepSorted = sleepSort(listOf(5, 4, 3, 2, 1))
        print(sleepSorted)
        assert(preSorted == sleepSorted)
    }

}