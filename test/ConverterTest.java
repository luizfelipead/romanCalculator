import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void shouldConverterValidSymbol() {
        Converter converter = new Converter();
        int number = converter.convert("I");
        assertEquals(1, number);
    }

    @Test
    public void shouldSumValidSymbols() {
        Converter converter = new Converter();
        int number = converter.convert("II");
        assertEquals(2, number);
    }

    @Ignore
    public void shouldSubtractWhenLowestNumberBeforeBiggest() {
        Converter converter = new Converter();
        int number = converter.convert("IX");
        assertEquals(9, number);
    }

}
