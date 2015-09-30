import java.util.ArrayList;
import java.util.List;

public class Crypto {

    private String text;
    private int size;

    public Crypto(String msg) {
        text = msg.toLowerCase().replaceAll("\\W", "");
        size = (int)Math.ceil(Math.sqrt(text.length()));
    }

    public String getNormalizedPlaintext() {
        return text;
    }

    public int getSquareSize() {
        return size;
    }

    public List<String> getPlaintextSegments() {
        List<String> segments = new ArrayList<>();
        int num_segs = text.length()/size;
        for (int i=0; i<num_segs; i++) {
            segments.add(text.substring(i*size, (i+1)*size));
        }
        if (num_segs*size < text.length()) {
            segments.add(text.substring(num_segs * size));
        }
        return segments;
    }

    public List<String> getCipherSegments() {
        List<String> cipher_segments = new ArrayList<>();
        List<String> plain_segments = getPlaintextSegments();
        for (int i=0; i<size; i++) {
            String word = "";
            for (String seg : plain_segments) {
                if (i < seg.length()) {
                    word += seg.charAt(i);
                }
            }
            cipher_segments.add(word);
        }
        return cipher_segments;
    }

    public String getCipherText() {
        return String.join("", getCipherSegments());
    }

    public String getNormalizedCipherText() {
        return String.join(" ", getCipherSegments());
    }

}
