public class Trinary {

    public static int toDecimal(String num) {
        int decimal = 0;
        char[] symbols = num.toCharArray();
        for (char c : symbols) {
            decimal *= 3;
            if (c == '2') {
                decimal += 2;
            } else if (c == '1') {
                decimal += 1;
            } else if (c != '0') {
                return 0;
            }
        }
        return decimal;
    }

}
