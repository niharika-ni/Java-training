import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementInArrayList {
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

        // Get user input for the element to search
        System.out.println("\nEnter the element to search:");
        String searchElement = scanner.nextLine();

        // Search for the element in the ArrayList
        boolean found = elementsList.contains(searchElement);

        // Display the result of the search
        if (found) {
            System.out.println("Element '" + searchElement + "' found in the ArrayList.");
        } else {
            System.out.println("Element '" + searchElement + "' not found in the ArrayList.");
        }

        scanner.close();
    }
}
