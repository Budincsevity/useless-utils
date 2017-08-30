import java.util.concurrent.ThreadLocalRandom

object BooleanUtils {
    fun maybe() = ThreadLocalRandom.current().nextBoolean()
}
