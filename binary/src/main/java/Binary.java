public class Binary {

    private int number = 0;

    public Binary(String bin) {
        for (int i=0; i<bin.length(); i++) {
            number *= 2;
            if (bin.charAt(i) == '1') {
                number += 1;
            } else if (bin.charAt(i) != '0') {
                number = 0;
                break;
            }
        }
    }

    public int getDecimal() {
        return number;
    }

}
