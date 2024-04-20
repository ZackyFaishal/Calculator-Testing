package testing.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OperationTest {

	@Test
	public void addTesting() {
		Operation operation = new Operation();
		int actual = operation.add(1, 2);
		assertEquals (3,actual);
	}
	
	@Test
	public void subtractTesting() {
		Operation operation = new Operation();
		int actual = operation.subtract(3, 1);
		assertEquals (2,actual);
	}

	@Test
	public void multiplyTesting() {
		Operation operation = new Operation();
		int actual = operation.multiply(-3, -4);
		assertEquals (12,actual);
	}

	@Test
	public void divideTesting() {
		Operation operation = new Operation();
		double actual = operation.divide(2, 4);
		assertEquals (0.5,actual);
	}
}
