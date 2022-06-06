import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTestTwo {
    @Test
    public void testMultiply(){
        Calculation calculation = new Calculation();
        assertEquals(9, calculation.multiply(3,3));
    }
    @Test
    public void testDivide(){
        Calculation calculation = new Calculation();
        assertEquals(2, calculation.divide(18,9), 0);
    }
}
