import java.util.Random;

public class Cipher {

    private String key = "";

    public Cipher() {
        Random rand = new Random();
        for (int i=0; i<100; i++) {
            key += (char)('a' + rand.nextInt(26));
        }
    }

    public Cipher(String k) {
        if (!k.equals(k.toLowerCase())) {
            throw new IllegalArgumentException("Key must be lower case");
        }
        if (k.matches(".*\\d+.*")) {
            throw new IllegalArgumentException("Key cannot contain numbers");
        }
        if (k.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be empty");
        }
        key = k;
    }

    public String encode(String msg) {
        String output = "";
        for (int i=0; i<msg.length(); i++) {
            int shift = key.charAt(i % key.length()) - 'a';
            if (msg.charAt(i) + shift > 'z') {
                shift -= 26;
            }
            output += (char)(msg.charAt(i) + shift);
        }
        return output;
    }

    public String decode(String msg) {
        String output = "";
        for (int i=0; i<msg.length(); i++) {
            int shift = key.charAt(i % key.length()) - 'a';
            if (msg.charAt(i) - shift < 'a') {
                shift -= 26;
            }
            output += (char)(msg.charAt(i) - shift);
        }
        return output;
    }

    public String getKey() {
        return key;
    }

}
