package testing.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OperationTesting {

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
	
	
}
