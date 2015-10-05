import java.util.ArrayList;
import java.util.List;

public class Sieve {

    private List<Integer> primes;

    public Sieve(int limit) {
        primes = new ArrayList<>();
        for (int i=2; i<=limit; i++) {
            primes.add(i);
        }
        int position = 0;
        while (position < primes.size()) {
            int num = primes.get(position);
            for (int i=2; i<=limit/num; i++) {
                int index = primes.indexOf(i*num);
                if (index > 0) {
                    primes.remove(index);
                }
            }
            position++;
        }
    }

    public List<Integer> getPrimes() {
        return primes;
    }

}
