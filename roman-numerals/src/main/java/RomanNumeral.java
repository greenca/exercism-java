public class RomanNumeral {

    private String numeral = "";

    public RomanNumeral(int number) {
        numeral += convertDigit(number/1000, "M", "M", "M");
        number %= 1000;
        numeral += convertDigit(number/100, "C", "D", "M");
        number %= 100;
        numeral += convertDigit(number/10, "X", "L", "C");
        number %= 10;
        numeral += convertDigit(number, "I", "V", "X");
    }

    public String getRomanNumeral() {
        return numeral;
    }

    public String convertDigit(int digit, String ones, String fives, String tens) {
        String str_digit;
        if (digit <= 3) {
            str_digit = new String(new char[digit]).replace("\0", ones);
        } else if (digit == 4) {
            str_digit = ones + fives;
        } else if (digit <= 8) {
            str_digit = fives + new String(new char[digit-5]).replace("\0", ones);
        } else {
            str_digit = ones + tens;
        }
        return str_digit;
    }
}
