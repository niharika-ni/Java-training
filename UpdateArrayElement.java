import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArrayElement {
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

        // Get user input for the index to update the element
        System.out.println("\nEnter the index to update the element:");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < elementsList.size()) {
            scanner.nextLine(); // Consume the newline character

            // Get user input for the new element value
            System.out.println("Enter the new element value:");
            String newElement = scanner.nextLine();

            // Update the element at the specified index
            elementsList.set(index, newElement);

            // Display the ArrayList after updating
            System.out.println("\nArrayList after updating at index " + index + ":");
            for (String e : elementsList) {
                System.out.println(e);
            }
        } else {
            System.out.println("\nInvalid index. Please enter a valid index.");
        }

        scanner.close();
    }
}
