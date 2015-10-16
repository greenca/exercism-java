public class Octal {

    private int decimal = 0;

    public Octal(String octal) {
        for (char c : octal.toCharArray()) {
            if (!Character.isDigit(c)) {
                decimal = 0;
                return;
            }
            int n = Character.getNumericValue(c);
            if (n > 7) {
                decimal = 0;
                return;
            }
            decimal *= 8;
            decimal += n;
        }
    }

    public int getDecimal() {
        return decimal;
    }

}
