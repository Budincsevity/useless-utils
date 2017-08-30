import com.google.common.collect.Ordering
import java.util.Collections

object CollectionUtils {
    fun <T : Comparable<Nothing>> sort(unsortedList: List<T>): List<T> {
        val everyday = unsortedList.toMutableList()
        var ordered = Ordering.natural<T>().isOrdered(everyday)

        while (!ordered) {
            Collections.shuffle(everyday) // Everyday I'm shufflin'
            ordered = Ordering.natural<T>().isOrdered(everyday)
        }

        return everyday
    }
}