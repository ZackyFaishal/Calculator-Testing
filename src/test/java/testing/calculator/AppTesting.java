
package testing.calculator;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class AppTesting 
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final String newLine = System.getProperty("line.separator");
    
    @Test
    public void invalidFirstNumberNotNumber() {
        String input = "$";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Error: Input harus berupa angka." + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }

    @Test
    public void invalidFirstNumber() {
        String input = "32769";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Error: Angka harus berada dalam rentang -32,768 hingga 32,767." + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }
    
    @Test
    public void invalidSecondNumberNotNumber() {
        String input = "10" + newLine + "$";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Error: Input harus berupa angka." + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }

    @Test
    public void invalidSecondNumber() {
        String input = "8" + newLine + "-32768";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Error: Angka harus berada dalam rentang -32,768 hingga 32,767." + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }


    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    // @Test
    // public void validOperationInteger(){
    //     Operation operation = new Operation();
    //     int actual = operation.multiply(5,2);
    //     assertEquals(10, actual);

    // }

    // @Test
	// public void addTesting() {
	// 	Operation operation = new Operation();
	// 	int actual = operation.add(1, 2);
	// 	assertEquals (3,actual);
	// }
}
