import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void shouldConverterISymbol() {
        Converter converter = new Converter();
        int number = converter.convert("I");
        assertEquals(1, number);
    }

    @Test
    public void shouldConverterVSymbol() {
        Converter converter = new Converter();
        int number = converter.convert("V");
        assertEquals(5, number);
    }

    @Test
    public void shouldConverterIIin2() {
        Converter converter = new Converter();
        int number = converter.convert("II");
        assertEquals(2, number);
    }

    @Test
    public void shouldConverterXXIIin22() {
        Converter converter = new Converter();
        int number = converter.convert("XXII");
        assertEquals(22, number);
    }

    @Ignore
    public void shouldConverterIXin9() {
        Converter converter = new Converter();
        int number = converter.convert("IX");
        assertEquals(9, number);
    }

}
