import java.util.Random;

public class BooleanUtils {
    private static final Random RANDOM = new Random();

    public boolean maybe() {
        return RANDOM.nextBoolean();
    }
}
