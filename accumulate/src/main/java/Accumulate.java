import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class Accumulate {

    public static <T> Collection<T> accumulate(Collection<T> collection, Function<T, T> func) {
        Collection<T> output = new ArrayList<>();
        for (T item : collection) {
            output.add(func.apply(item));
        }
        return output;
    }

}
