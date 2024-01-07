import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.println("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Get the ASCII value of the character
        int asciiValue = (int) inputChar;

        // Print the result
        System.out.println("ASCII value of '" + inputChar + "' is: " + asciiValue);
    }
}
