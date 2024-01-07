import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an octal number
        System.out.print("Enter an octal number: ");
        String octalInput = scanner.next();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Convert octal to decimal
        int decimal = Integer.parseInt(octalInput, 8);

        // Convert decimal to hexadecimal
        String hexadecimalOutput = Integer.toHexString(decimal);

        // Print the result
        System.out.println("Octal number: " + octalInput);
        System.out.println("Hexadecimal number: " + hexadecimalOutput);
    }
}
