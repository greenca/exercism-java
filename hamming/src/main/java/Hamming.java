public class Hamming {

    public static int compute(String dna1, String dna2) {
        int distance = 0;
        int len1 = dna1.length();
        int len2 = dna2.length();
        if (len1 != len2) {
            throw new IllegalArgumentException("DNA strings must be the same length");
        }
        for (int i=0; i<len1; i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
}
