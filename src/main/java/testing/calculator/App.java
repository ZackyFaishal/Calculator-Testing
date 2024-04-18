package testing.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number 1
        System.out.print("Masukkan angka pertama: ");
        String inputNumber1 = scanner.nextLine();
        String validationError = Validation.validateNumber(inputNumber1);
        if (validationError != null) {
            System.out.println(validationError);
            return; // Proses berhenti jika ada kesalahan validasi
        }
        int number1 = Integer.parseInt(inputNumber1);

        // Input number 2
        System.out.print("Masukkan angka kedua: ");
        String inputNumber2 = scanner.nextLine();
        validationError = Validation.validateNumber(inputNumber2);
        if (validationError != null) {
            System.out.println(validationError);
            return; // Proses berhenti jika ada kesalahan validasi
        }
        int number2 = Integer.parseInt(inputNumber2);

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.nextLine();
        validationError = Validation.validateOperator(operator);
        if (validationError != null) {
            System.out.println(validationError);
            return; // Proses berhenti jika ada kesalahan validasi
        }

        // For division operation, validate divisor
        if (operator.equals("/") && number2 == 0) {
            System.out.println(Validation.validateDivision(number2));
            return; // Proses berhenti jika ada kesalahan validasi
        }

        // Calculate result
        Calculate calculator = new Calculate();
        float result = calculator.calculation(number1, number2, operator.charAt(0));
        
        // Check if the result is an integer or a decimal
        if (result == (int) result) {
            System.out.println("Hasil perhitungan " + number1 + " " + operator + " " + number2 + " = " + (int) result);
        } else {
            System.out.println("Hasil perhitungan " + number1 + " " + operator + " " + number2 + " = " + result);
        }
    }
}
