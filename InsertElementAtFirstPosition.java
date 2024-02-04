import java.util.ArrayList;
import java.util.Scanner;

public class InsertElementAtFirstPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store elements
        ArrayList<String> elementsList = new ArrayList<>();

        // Get user input to add elements to the ArrayList
        System.out.println("Enter elements (type 'exit' to finish):");

        String element;
        while (true) {
            element = scanner.nextLine();

            if (element.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the element to the ArrayList
            elementsList.add(element);
        }

        // Display the original ArrayList
        System.out.println("\nOriginal ArrayList:");
        for (String e : elementsList) {
            System.out.println(e);
        }

        // Get user input for the element to be inserted at the first position
        System.out.println("\nEnter the element to insert at the first position:");
        String newElement = scanner.nextLine();

        // Insert the element at the first position
        elementsList.add(0, newElement);

        // Display the ArrayList after insertion
        System.out.println("\nArrayList after inserting at the first position:");
        for (String e : elementsList) {
            System.out.println(e);
        }

        scanner.close();
    }
}
