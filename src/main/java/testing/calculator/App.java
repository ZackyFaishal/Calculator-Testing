package testing.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            String input1, input2, operator = null;
            int number1 = 0, number2 = 0;
            boolean isValidInput = false;

            clearScreen(); // Bersihkan layar saat memulai perhitungan

            while (!isValidInput) {
                // Input angka pertama
                System.out.println("Masukkan angka pertama:");
                input1 = scanner.nextLine();
                String error1 = Validation.validateNumber(input1);
                if (error1 != null) {
                    System.out.println(error1);
                    System.out.println("Tekan tombol enter untuk memasukkan angka pertama kembali...");
                    scanner.nextLine(); // Menunggu tombol enter sebelum melanjutkan
                    clearScreen(); // Bersihkan layar sebelum kembali meminta input
                    continue;
                }
                number1 = Integer.parseInt(input1);
                isValidInput = true;
            }

            isValidInput = false;
            while (!isValidInput) {
                // Input angka kedua
                System.out.println("Masukkan angka kedua:");
                input2 = scanner.nextLine();
                String error2 = Validation.validateNumber(input2);
                if (error2 != null) {
                    System.out.println(error2);
                    System.out.println("Tekan tombol enter untuk memasukkan angka kedua kembali...");
                    scanner.nextLine(); // Menunggu tombol enter sebelum melanjutkan
                    clearScreen(); // Bersihkan layar sebelum kembali meminta input
                    continue;
                }
                number2 = Integer.parseInt(input2);
                isValidInput = true;
            }

            isValidInput = false;
            while (!isValidInput) {
                // Input operator
                System.out.println("Masukkan operator (+, -, *, /):");
                operator = scanner.nextLine();
                String error3 = Validation.validateOperator(operator);
                if (error3 != null) {
                    System.out.println(error3);
                    System.out.println("Tekan tombol enter untuk memasukkan operator kembali...");
                    scanner.nextLine(); // Menunggu tombol enter sebelum melanjutkan
                    clearScreen(); // Bersihkan layar sebelum kembali meminta input
                    continue;
                }
                isValidInput = true;
            }

            // Validasi pembagian
            if (operator.equals("/") && Validation.validateDivision(number2) != null) {
                System.out.println(Validation.validateDivision(number2));
                System.out.println("Tekan tombol enter untuk memasukkan input kembali...");
                scanner.nextLine(); // Menunggu tombol enter sebelum melanjutkan
                clearScreen(); // Bersihkan layar sebelum kembali meminta input
                continue;
            }

         // Lakukan perhitungan
            String operation = number1 + " " + operator + " " + number2;
            Calculate calculator = new Calculate();
            float result = (float) calculator.calculation(number1, number2, operator.charAt(0));
            if (operator.equals("/")) {
                System.out.println("Hasil perhitungan : " + operation + " = " + result);
            } else {
                int intResult = (int) result;
                System.out.println("Hasil perhitungan: " + operation + " = " + intResult);
            }

            // Meminta pengguna untuk mengulang perhitungan atau keluar dari program
            System.out.println("Tekan tombol enter untuk melakukan perhitungan kembali atau tekan sembarang tombol untuk keluar...");
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                isRunning = false;
            }
            clearScreen(); // Bersihkan layar sebelum memulai perhitungan kembali
        }
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            // Handle exception
            System.out.println(e.getMessage());
        }
    }
}
