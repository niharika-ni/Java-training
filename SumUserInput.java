import java.util.Scanner; 
// Import the Scanner class

class SumUserInput {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner value = new Scanner(System.in); 
    // Create a Scanner object value
    System.out.println("Enter a number:");
    x = value.nextInt(); 
    // Read user input

    System.out.println("Type another number:");
    y = value.nextInt(); 
    // Read user input

    sum = x + y;  
    // Calculate the sum of x + y
    System.out.println("Sum is: " + sum); 
    // Print the sum
  }
}