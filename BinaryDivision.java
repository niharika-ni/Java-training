import java.util.Scanner;

public class BinaryDivision {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the binary numbers
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.next();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.next();

       
        scanner.close();

        // Convert binary numbers to decimal
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Check if the second binary number is not zero before division
        if (decimal2 != 0) {
            // Perform division
            int result = decimal1 / decimal2;
            
            // Print the result
    
            System.out.println(Integer.toBinaryString(result));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
