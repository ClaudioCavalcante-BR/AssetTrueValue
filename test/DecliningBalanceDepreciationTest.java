
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import strategy.DecliningBalanceDepreciation;


/**
 *
 * @author claudioalmeida
 */
public class DecliningBalanceDepreciationTest {
    
    @Test
    public void testCalculateDecliningDepreciation() {
        DecliningBalanceDepreciation strategy = new DecliningBalanceDepreciation();
        double result = strategy.calculate(10000.0, 5);
        assertTrue(result < 2000.0); // valor decrescente maior que linear
    }

    @Test
    public void testCalculateNegativeValue() {
        DecliningBalanceDepreciation strategy = new DecliningBalanceDepreciation();
        double result = strategy.calculate(-5000.0, 5);
        assertTrue(result < 0);
    }
    
    
}
