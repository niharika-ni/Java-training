import java.util.Scanner; 
// Import the Scanner class

class DivisionUserInput {
  public static void main(String[] args) {
    double x, y, div;
    Scanner value = new Scanner(System.in); 
    // Create a Scanner object named value
    System.out.println("Enter a number:");
    x = value.nextDouble(); 
    // Read user input

    System.out.println("Enter another number:");
    y = value.nextDouble(); 
    // Read user input

    div = x / y;  
    // Calculate the division of x / y
    System.out.println("answer is: " + div); 
    // Print the div
  }
}

