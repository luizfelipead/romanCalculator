import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest {

    @Test
    public void shouldReturnValidForI() {
        Validator validator = new Validator();
        assertTrue(validator.validNumber("I"));
    }

    @Test
    public void shouldReturnInvalidForT() {
        Validator validator = new Validator();
        assertFalse(validator.validNumber("T"));
    }

    @Test
    public void shouldReturnValidForX() {
        Validator validator = new Validator();
        assertTrue(validator.validNumber("X"));
    }

    @Test
    public void shouldReturnInvalidForIIII() {
        Validator validator = new Validator();
        assertFalse(validator.validNumber("IIII"));
    }

}
