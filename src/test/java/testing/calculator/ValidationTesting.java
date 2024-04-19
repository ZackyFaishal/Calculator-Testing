package testing.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class ValidationTesting {

	//validateNumber
	@Test
	public void invalidNumberTesting() {
	    String actual = Validation.validateNumber("-32769");
	    assertEquals("Error: Angka harus berada dalam rentang -32,768 hingga 32,767.", actual);
	}
	
	@Test
	public void validNumberTesting() {
	    String actual = Validation.validateNumber("3");
	    assertEquals(null, actual);
	}

	//validateOperator
	@Test
	public void invalidOperatorTesting() {
	    String actual = Validation.validateOperator("#");
	    assertEquals("Error: Operator tidak valid.", actual);
	}
	
	@Test
	public void validAddOperatorTesting() {
	    String actual = Validation.validateOperator("+");
	    assertEquals(null, actual);
	}
	
	@Test
	public void validSubtractOperatorTesting() {
	    String actual = Validation.validateOperator("-");
	    assertEquals(null, actual);
	}
	
	@Test
	public void validMultiplyOperatorTesting() {
	    String actual = Validation.validateOperator("*");
	    assertEquals(null, actual);
	}
	
	@Test
	public void validDivideOperatorTesting() {
	    String actual = Validation.validateOperator("/");
	    assertEquals(null, actual);
	}

	//validateDivision
	@Test
	public void invalidDivisorTesting() {
	    String actual = Validation.validateDivision(0);
	    assertEquals("Error: Pembagian dengan nol tidak diizinkan.", actual);
	}
	
	@Test
	public void validDivisorTesting() {
	    String actual = Validation.validateDivision(3);
	    assertEquals(null, actual);
	}
}