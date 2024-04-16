package testing.calculator;

public class Validation {

    public static String validateNumber(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number < -32768 || number > 32767) {
                return "Error: Angka harus berada dalam rentang -32,768 hingga 32,767.";
            }
            return null; // Tidak ada kesalahan
        } catch (NumberFormatException e) {
            return "Error: Input harus berupa angka.";
        }
    }

    public static String validateOperator(String operator) {
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            return "Error: Operator tidak valid.";
        }
        return null; // Tidak ada kesalahan
    }

    public static String validateDivision(int divisor) {
        if (divisor == 0) {
            return "Error: Pembagian dengan nol tidak diizinkan.";
        }
        return null; // Tidak ada kesalahan
    }
}
