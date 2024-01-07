import java.util.Scanner;

public class AddBinaryNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        String binary1,binary2,sum;
        
        System.out.println("Enter the first binary number: ");
        binary1 = scanner.next();

        System.out.print("Enter the second binary number: ");
        binary2 = scanner.next();

        // Close the Scanner 
        scanner.close();

        // Add the binary numbers
        sum = addBinary(binary1, binary2);

        // Print the result
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + sum);
    }

    // Method to add two binary numbers
    public static String addBinary(String binary1, String binary2) {
        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the integers
        int result = num1 + num2;

        // Convert the result back to binary
        return Integer.toBinaryString(result);
        
        /*ddBinary to perform the addition of two binary numbers. 
        It takes user input for two binary numbers, converts them to integers, adds them, 
        and then converts the result back to binary format. 
        */
    }
}
