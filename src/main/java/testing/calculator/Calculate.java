package testing.calculator;

public class Calculate {
	public float calculation (int number1, int number2, char operation) {
		
		float result = 0;
		
		 Operation operationObj = new Operation();

	        switch (operation) {
	            case '+':
	                result = operationObj.add(number1, number2);
	                break;
	            case '-':
	                result =  operationObj.subtract(number1, number2);
	                break;
	            case '*':
	                result =  operationObj.multiply(number1, number2);;
	                break;
	            case '/':
	                result =  (float) operationObj.divide(number1, number2);
	                break;
	        }

	        return result;
				
	}
}
