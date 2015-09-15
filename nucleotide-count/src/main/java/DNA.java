import java.util.HashMap;
import java.util.Map;

public class DNA {
    private Map<Character, Integer> counts;
    public DNA(String d) {
        counts = new HashMap<>();
        counts.put('A', 0);
        counts.put('C', 0);
        counts.put('G', 0);
        counts.put('T', 0);
        for (char n : d.toCharArray())
            if (counts.containsKey(n))
                counts.put(n, counts.get(n) + 1);
            else throw new IllegalArgumentException();
    }
    public Integer count(Character n) {
        if (counts.containsKey(n))
            return counts.get(n);
        else throw new IllegalArgumentException();
    }
    public Map<Character, Integer> nucleotideCounts() {
        return counts;
    }
}
