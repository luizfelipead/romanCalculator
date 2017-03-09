import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface Numbers {

   Map<Character, Integer> NUMBERS = Collections.unmodifiableMap(
           new HashMap<Character, Integer>() {{
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
           }});
}
