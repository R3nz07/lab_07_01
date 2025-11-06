package sebas.lab07_refactoring;

public class PhoneNumber {
    private String number;
    public PhoneNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public boolean isValid() {
        return number != null && number.matches("\\d{9}");
    }
    public String getFormatted() {
        if (number == null || number.length() != 9) {
            return number;
        }
        return number.substring(0, 3) + "-" +
                number.substring(3, 6) + "-" +
                number.substring(6);
    }
    public void setNumber(String number) {
        this.number = number;
    }
}

