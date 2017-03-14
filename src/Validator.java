import java.util.Arrays;
import java.util.List;

public class Validator {

    public static final int MAXIMUM_LETTER_REPETITIONS = 4;

    public Boolean validNumber(String number) {
        return containOnlyValidValues(number) && !containInvalidSequence(number);
    }

    private Boolean containOnlyValidValues(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Numbers.NUMBERS.containsKey(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private Boolean containInvalidSequence(String number) {
        List<String> characterList = Arrays.asList(number.split(""));

        for (Character letter : Numbers.NUMBERS.keySet()) {
            Long count = characterList.stream().filter(string -> string.equals(letter.toString())).count();
            
            if(count > MAXIMUM_LETTER_REPETITIONS) {
                return true;
            } else if(count == MAXIMUM_LETTER_REPETITIONS) {
                return number.contains(returnSequence(letter, MAXIMUM_LETTER_REPETITIONS));
            }
        }
        return false;
    }

    private String returnSequence(Character letter, int repetition) {
        StringBuilder sequence = new StringBuilder();
        for(int i=0; i < repetition; i++) {
            sequence.append(letter);
        }
        return sequence.toString();
    }

}
