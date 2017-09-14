import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CollectionUtils {
    
    private CollectionUtils() {
    }
    
    public static <T extends Comparable> List<T> sort(List<T> unsortedList) {
        List<T> everyday = new ArrayList<>(unsortedList);
        boolean ordered = Ordering.natural().isOrdered(everyday);

        while (!ordered) {
            Collections.shuffle(everyday); // Everyday I'm shufflin'
            ordered = Ordering.natural().isOrdered(everyday);
        }

        return everyday;
    }
}
