import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Long> getForNumber(long number) {
        List<Long> factors = new ArrayList<>();
        long i = 2;
        while (number > 1) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
            i++;
        }
        return factors;
    }

}
