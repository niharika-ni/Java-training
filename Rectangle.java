import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scannerobj = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        double length = scannerobj.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scannerobj.nextDouble();

        // Close the Scanner 
        scannerobj.close();

        // Calculate the area and perimeter of the rectangle
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Print the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
