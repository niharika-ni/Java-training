import java.util.Scanner;

public class CompareValues {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Compare values and determine the result
        int result = compareValues(num1, num2);

        // Print the result
        System.out.println("Result: " + result);
    }

    // Method to compare values and determine the result
    
    /*if the two values are the same, return 0 and 
    find the smallest value if the two values have the same remainder when divided by 6.
    or else return the maxm value*/
    
    private static int compareValues(int a, int b) {
        if (a == b) 
        {
            return 0;
        } 
        else if (a % 6 == b % 6) 
        {
            return Math.min(a, b);
        }
        else 
        {
            return Math.max(a, b);
        }
        
    }
}
