import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Check whether the number is even or odd
        int result = (number % 2 == 0) ? 1 : 0;
        /*The result is calculated using the ternary operator (? :). 
        If the number is even, the result is 1; otherwise, it's 0.
        */
        
        // Print the result
        System.out.println("Result: " + result);
    }
}
