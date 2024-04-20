
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
public class AppTest 
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final String newLine = System.getProperty("line.separator");
    

    @Test
    public void inputValidOperationIntegerTesting() {
        String input = "5" + newLine + "2" + newLine + "*" + newLine;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Hasil perhitungan 5 * 2 = 10" + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }

    @Test
    public void invalidFirstNumberNotNumberTesting() {
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
    public void invalidFirstNumberTesting() {
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
    public void invalidSecondNumberNotNumberTesting() {
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
    public void invalidSecondNumberTesting() {
        String input = "10" + newLine + "-32799";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Error: Angka harus berada dalam rentang -32,768 hingga 32,767." + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }

    @Test
    public void invalidOperatorTesting() {
        String input = "4" + newLine + "6" + newLine + "#" + newLine;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Error: Operator tidak valid." + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }

    @Test
    public void dividedByZeroTesting() {
        String input = "7" + newLine + "0" + newLine + "/" + newLine;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Error: Pembagian dengan nol tidak diizinkan." + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }

    @Test
    public void inputValidOperationDecimalTesting() {
        String input = "10" + newLine + "4" + newLine + "/" + newLine;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    
        App.main(new String[0]);
    
        String errorMessage = "Hasil perhitungan 10 / 4 = 2.5" + newLine;
        assertTrue(outContent.toString().contains(errorMessage));
    }

    }
