import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Strain {

    public static <T> Collection<T> keep(Collection<T> collection, Predicate<T> condition) {
        Collection<T> kept = new ArrayList<>();
        for (T item : collection) {
            if (condition.test(item)) {
                kept.add(item);
            }
        }
        return kept;
    }

    public static <T> Collection<T> discard(Collection<T> collection, Predicate<T> condition) {
        Collection<T> kept = new ArrayList<>();
        for (T item : collection) {
            if (!condition.test(item)) {
                kept.add(item);
            }
        }
        return kept;
    }

}
