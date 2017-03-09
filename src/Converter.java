public class Converter {

    public Integer convert(String number) {
        int total = 0;
        for (int i = 0; i < number.length(); i++) {
            total += Numbers.NUMBERS.get(number.charAt(i));
        }
        return total;
    }

}
