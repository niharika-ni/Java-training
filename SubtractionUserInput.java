import java.util.Scanner; 
// Import the Scanner class

class SubtractionUserInput {
  public static void main(String[] args) {
    int x, y, sub;
    Scanner value = new Scanner(System.in); 
    // Create a Scanner object named value
    System.out.println("Enter a number:");
    x = value.nextInt(); 
    // Read user input

    System.out.println("Enter another number:");
    y = value.nextInt(); 
    // Read user input

    sub = x - y;  
    // Calculate the dif of x - y
    System.out.println("difference is: " + sub); 
    // Print the dif
  }
}