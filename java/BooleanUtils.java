import java.util.Random;

public class BooleanUtils {
    private static final Random RANDOM = new Random();

    public static boolean maybe() {
        return RANDOM.nextBoolean();
    }
}
