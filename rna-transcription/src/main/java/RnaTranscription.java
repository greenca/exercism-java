public class RnaTranscription {

    public static String ofDna(String dna) {
        String rna = "";
        for (char nucleotide : dna.toCharArray()) {
            switch (nucleotide) {
                case 'A':
                    rna += 'U';
                    break;
                case 'C':
                    rna += 'G';
                    break;
                case 'G':
                    rna += 'C';
                    break;
                case 'T':
                    rna += 'A';
                    break;
            }
        }
        return rna;
    }

}
