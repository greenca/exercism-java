import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    private static final String[] letter_groups = {
            "AEIOULNRST",
            "DG",
            "BCMP",
            "FHVWY",
            "K",
            "JX",
            "QZ",
    };

    private static final int[] group_scores = {1, 2, 3, 4, 5, 8, 10};

    private static final Map<Character, Integer> letter_scores;
    static {
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i=0; i<letter_groups.length; i++) {
            for (int j=0; j<letter_groups[i].length(); j++) {
                sMap.put(letter_groups[i].charAt(j), group_scores[i]);
            }
        }
        letter_scores = Collections.unmodifiableMap(sMap);
    }

    private int score = 0;

    public Scrabble(String input) {
        if (input == null) return;
        input = input.toUpperCase();
        for (int i=0; i<input.length(); i++) {
            score += letter_scores.getOrDefault(input.charAt(i), 0);
        }
    }

    public int getScore() {
        return score;
    }

}
