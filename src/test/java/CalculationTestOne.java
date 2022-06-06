import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTestOne {
    @Test
    public void testAdd(){
        Calculation calculation = new Calculation();
        assertEquals(4, calculation.add(2,2));
    }
    @Test
    public void testSubtract(){
        Calculation calculation = new Calculation();
        assertEquals(0, calculation.subtract(2,2));
    }
}
