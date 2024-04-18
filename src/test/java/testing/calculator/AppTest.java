
package testing.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
	public void addTesting() {
		Operation operation = new Operation();
		int actual = operation.add(1, 2);
		assertEquals (3,actual);
	}
}
