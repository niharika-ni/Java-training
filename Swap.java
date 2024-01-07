public class Swap {
    public static void main(String[] args) {
        // Given variables
        int num1 = 5;
        int num2 = 7;

        // Print the values before swapping
        System.out.println("Before swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // Swap the values
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        /*here we are swapping the 2 variables using a temporary variables.
        we are storing the value of num1 in temp and assigning value of num2 to num1 and then assigning value of temp to num1
        */

        // Print the values after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
