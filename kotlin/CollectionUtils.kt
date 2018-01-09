import com.google.common.collect.Ordering
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.util.concurrent.TimeUnit

object CollectionUtils {
    fun <T : Comparable<Nothing>> sort(unsortedList: List<T>): List<T> {
        val everyday = unsortedList.toMutableList()
        var ordered = Ordering.natural<T>().isOrdered(everyday)

        while (!ordered) {
            everyday.shuffle() // Everyday I'm shufflin'
            ordered = Ordering.natural<T>().isOrdered(everyday)
        }

        return everyday
    }

    fun sleepSort(unsortedList: List<Long>): List<Long> {
        val newList = mutableListOf<Long>()
        val channel = Channel<Long>()

        unsortedList.forEach {
            launch {
                delay(it, TimeUnit.SECONDS)
                channel.send(it)
            }
        }

        (1..unsortedList.size).forEach { runBlocking { newList.add(channel.receive()) } }

        return newList
    }
}