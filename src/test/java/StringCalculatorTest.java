import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {
    @Test
    public void negativesThrow() {
        assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1,5"));
    }

    @Test
    public void numbersGreaterThan1000AreIgnored() {
        assertEquals(1, StringCalculator.add("1,1000"));
    }
}
