import java.util.Scanner; 
// Import the Scanner class

class MultiplicationUserInput {
  public static void main(String[] args) {
    int x, y, mul;
    Scanner value = new Scanner(System.in); 
    // Create a Scanner object named value
    System.out.println("Enter a number:");
    x = value.nextInt(); 
    // Read user input

    System.out.println("Enter another number:");
    y = value.nextInt(); 
    // Read user input

    mul = x * y;  
    // Calculate the multiplication of x * y
    System.out.println("multiplication is: " + mul); 
    // Print the mul
  }
}

