import com.google.common.collect.Ordering
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.util.*
import java.util.concurrent.TimeUnit

private infix fun <T> MutableList<T>.im(methodName: String): MutableList<T> {
    Collections::class.java.methods.first { it.parameterCount == 1 && it.name == methodName }?.invoke(null, this)
    return this
}

private fun <T : Comparable<*>> MutableList<T>.inn() = Ordering.natural<T>().isOrdered(this)

object CollectionUtils {

    fun <T : Comparable<*>> shuffleSort(unsortedList: List<T>): List<T> {
        val everyday = unsortedList.toMutableList()
        var ordered = Ordering.natural<T>().isOrdered(everyday)

        while (!ordered) {
            ordered = (everyday im "shuffle").inn()
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