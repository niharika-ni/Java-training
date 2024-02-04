import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElementAtIndex {
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

        // Get user input for the index to retrieve the element
        System.out.println("\nEnter the index to retrieve the element:");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < elementsList.size()) {
            // Retrieve the element at the specified index
            String retrievedElement = elementsList.get(index);
            System.out.println("\nElement at index " + index + ": " + retrievedElement);
        } else {
            System.out.println("\nInvalid index. Please enter a valid index.");
        }

        scanner.close();
    }
}
