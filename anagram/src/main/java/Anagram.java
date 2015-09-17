import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private String given_word;
    private String sorted_word;

    public Anagram(String s) {
        given_word = s.toLowerCase();
        char[] chars = given_word.toCharArray();
        Arrays.sort(chars);
        sorted_word = new String(chars);
    }

    public List<String> match(List<String> words) {
        List<String> anagrams = new ArrayList<>();
        for (String word : words) {
            String lower_word = word.toLowerCase();
            if (lower_word.equals(given_word)) continue;
            char[] chars = lower_word.toCharArray();
            Arrays.sort(chars);
            if (sorted_word.equals(new String(chars))) {
                anagrams.add(word);
            }
        }
        return anagrams;
    }
}
