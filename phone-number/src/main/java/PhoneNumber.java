public class PhoneNumber {

    private String phone_num = "0000000000";

    public PhoneNumber(String num) {
        String unformatted_num = num.replaceAll("\\D", "");
        if (unformatted_num.length() == 10) {
            phone_num = unformatted_num;
        }
        if ((unformatted_num.length() == 11) && (unformatted_num.charAt(0) == '1')) {
            phone_num = unformatted_num.substring(1);
        }
    }

    public String getNumber() {
        return phone_num;
    }

    public String getAreaCode() {
        return phone_num.substring(0, 3);
    }

    public String pretty() {
        return "(" + getAreaCode() + ") " + phone_num.substring(3, 6) + "-" + phone_num.substring(6);
    }
}
