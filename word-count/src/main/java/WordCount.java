import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> Phrase(String p) {
        Map<String, Integer> counts = new HashMap<>();
        p = p.toLowerCase();
        String[] words = p.split("\\W");
        for (String word : words) {
            if (!word.isEmpty()) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        return counts;
    }
}
