import java.util.ArrayList;
import java.util.List;

public class Luhn {

    private List<Integer> digits;
    private int[] addends;
    private int checksum;

    public Luhn(long num) {
        digits = new ArrayList<>();
        while (num > 0) {
            digits.add((int)num % 10);
            num /= 10;
        }
        addends = new int[digits.size()];
        checksum = 0;
        for (int i=0; i<digits.size(); i++) {
            int d = digits.get(i);
            if (i % 2 == 1) {
                d *= 2;
            }
            if (d > 9) {
                d = (d / 10) + (d % 10);
            }
            addends[digits.size()-i-1] = d;
            checksum += d;
        }
    }

    public int getCheckDigit() {
        return digits.get(0);
    }

    public int[] getAddends() {
        return addends;
    }

    public int getCheckSum() {
        return checksum;
    }

    public boolean isValid() {
        return (checksum % 10 == 0);
    }

    public static long create(long num) {
        Luhn luhn = new Luhn(10*num);
        int checksum = luhn.getCheckSum();
        if (checksum % 10 == 0) {
            checksum = 0;
        } else {
            checksum = 10 - (checksum % 10);
        }
        return 10*num + checksum;
    }

}
