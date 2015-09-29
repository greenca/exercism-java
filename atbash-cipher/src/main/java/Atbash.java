public class Atbash {

    public static String encode(String msg) {
        String output = "";
        String word = "";
        for (char c : msg.toLowerCase().toCharArray()) {
            if (word.length() == 5) {
                output += word + " ";
                word = "";
            }
            int ascii = (int)c;
            if ((ascii >= 97) && (ascii <= 122)) {
                word += (char)(122 - (ascii - 97));
            }
            if ((ascii >= 48) && (ascii <= 57)) {
                word += c;
            }
        }
        return (output + word).trim();
    }

    public static String decode(String msg) {
        String output = "";
        for (char c : msg.toLowerCase().toCharArray()) {
            int ascii = (int)c;
            if ((ascii >= 97) && (ascii <= 122)) {
                output += (char)(122 - (ascii - 97));
            }
            if ((ascii >= 48) && (ascii <= 57)) {
                output += c;
            }
        }
        return output;
    }

}
