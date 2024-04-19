package testing.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class CalculateTest {

    @Test
    public void testAddition() {
        Calculate calculate = new Calculate();
        float result = calculate.calculation(-4, 3, '+');
        assertEquals(-1, result, 0); // Expected result is -1
    }

    @Test
    public void testSubtraction() {
        Calculate calculate = new Calculate();
        float result = calculate.calculation(10, 15, '-');
        assertEquals(-5, result, 0); // Expected result is -5
    }

    @Test
    public void testMultiplication() {
        Calculate calculate = new Calculate();
        float result = calculate.calculation(-12, -2, '*');
        assertEquals(24, result, 0); // Expected result is 24
    }

    @Test
    public void testDivision() {
        Calculate calculate = new Calculate();
        float result = calculate.calculation(20, 4, '/');
        assertEquals(5, result, 0); // Expected result is 5
    }
}