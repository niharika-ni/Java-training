import java.util.Scanner;

public class SwapwoutTemp {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user (optional)
        Scanner scanner = new Scanner(System.in);

        int var1,var2;
        
        System.out.print("Enter the var1: ");
        var1 = scanner.nextInt();

        System.out.print("Enter the var2: ");
        var2 = scanner.nextInt();

        // Close the Scanner 
        scanner.close();

        // Print the values before swapping
        System.out.println("Before swapping:");
        System.out.println("Variable 1: " + var1);
        System.out.println("Variable 2: " + var2);

        // Swap the values of the two variables without using a third  temporary variable
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        /*
        the values of num1 and num2 have been swapped without using a third variable.
        Using arithmetic operations to manipulate the values that the original values can be exchanged without an additional temporary variable. 
        here in the first stem sum of var1 and var2 is stored in var1 then in 2nd we are subtracting var2 from the sum that will be obviouysly the previous var1 and we are storing it now in the var2.
        then the new var1 will be sum - new var2.
        */

        // Print the values after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("Variable 1: " + var1);
        System.out.println("Variable 2: " + var2);
    }
}
