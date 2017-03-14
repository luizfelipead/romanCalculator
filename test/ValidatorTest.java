import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest {

    @Test
    public void shouldReturnValidForValidLetterAndSequence() {
        Validator validator = new Validator();
        assertTrue(validator.validNumber("I"));
    }

    @Test
    public void shouldReturnInvalidForInvalidLetter() {
        Validator validator = new Validator();
        assertFalse(validator.validNumber("T"));
    }

    @Test
    public void shouldReturnInvalidforInvalidSequence() {
        Validator validator = new Validator();
        assertFalse(validator.validNumber("IIII"));
    }

    @Test
    public void shouldReturnValidFourRepetitiveElementsNotInSequence() {
        Validator validator = new Validator();
        assertTrue(validator.validNumber("CCLXXXIX"));
    }

    @Test
    public void shouldReturnInvalidFiveRepetitiveElementsNotInSequence() {
        Validator validator = new Validator();
        assertFalse(validator.validNumber("CCXLXXXIX"));
    }

}
