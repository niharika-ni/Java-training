import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.next();

        // Close the Scanner 
        scanner.close();

        // Convert binary to decimal
        int decimal = Integer.parseInt(binaryInput, 2);

        // Convert decimal to octal
        String octalOutput = Integer.toOctalString(decimal);
        
        /*Integer.parseInt(..., 2) to convert the binary input to decimal and
        Integer.toOctalString(...) to convert the decimal number to octal.
        */
        
        // Print the result
        System.out.println("Binary number: " + binaryInput);
        System.out.println("Octal number: " + octalOutput);
    }
}
