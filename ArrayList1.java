import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store colors
        ArrayList<String> colorsList = new ArrayList<>();

        // Get user input to add colors to the ArrayList
        System.out.println("Enter colors (type 'exit' to finish):");

        String color;
        while (true) {
            color = scanner.nextLine();

            if (color.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the color to the ArrayList
            colorsList.add(color);
        }

        // Print out the collection of colors
        System.out.println("\nColors in the ArrayList:");
        for (String c : colorsList) {
            System.out.println(c);
        }

        scanner.close();
    }
}
