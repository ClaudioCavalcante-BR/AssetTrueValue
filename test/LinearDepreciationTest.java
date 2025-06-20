
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import strategy.LinearDepreciation;


/**
 *
 * @author claudioalmeida
 */
public class LinearDepreciationTest {
    @Test
    public void testCalculateLinearDepreciation() {
        LinearDepreciation strategy = new LinearDepreciation();
        double result = strategy.calculate(10000.0, 5);
        assertEquals(2000.0, result, 0.01);
    }

    @Test
    public void testCalculateZeroLife() {
        LinearDepreciation strategy = new LinearDepreciation();
        assertThrows(ArithmeticException.class, () -> {
            strategy.calculate(10000.0, 0);
        });
    }
}
