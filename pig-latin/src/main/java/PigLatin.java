import java.util.ArrayList;
import java.util.List;

public class PigLatin {

    public static String translate(String input) {
        List<String> output = new ArrayList<>();
        String[] words = input.split(" ");
        for (String word : words) {
            output.add(translateWord(word));
        }
        return String.join(" ", output);
    }

    public static String translateWord(String word) {
        String output;
        word = word.toLowerCase();
        char first = word.charAt(0);
        if ("aeiou".indexOf(first) != -1) {
            output = word + "ay";
        } else {
            String first2 = word.substring(0, 2);
            String first3 = word.substring(0, 3);
            if ((first3.equals("squ")) || (first3.equals("thr")) || (first3.equals("sch"))) {
                output = word.substring(3) + first3 + "ay";
            } else if ((first2.equals("ch")) || (first2.equals("qu")) || (first2.equals("th"))) {
                output = word.substring(2) + first2 + "ay";
            } else if ((first2.equals("yt")) || (first2.equals("xr"))) {
                output = word + "ay";
            } else {
                output = word.substring(1) + first + "ay";
            }
        }
        return output;
    }

}
