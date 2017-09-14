import java.util.Random;

public final class BooleanUtils {
    private static final Random RANDOM = new Random();

    private BooleanUtils() {
    }

    public static boolean maybe() {
        return RANDOM.nextBoolean();
    }
}
