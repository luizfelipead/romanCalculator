public class Validator {

    public Boolean validNumber(String number) {
        return containOnlyValidValues(number);
    }

    private Boolean containOnlyValidValues(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Numbers.NUMBERS.containsKey(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
