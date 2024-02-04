import java.util.ArrayList;
import java.util.Scanner;

public class RemoveThirdElement {
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

        // Check if there are at least three elements in the ArrayList
        if (elementsList.size() >= 3) {
            // Remove the third element (at index 2)
            elementsList.remove(2);

            // Display the ArrayList after removing the third element
            System.out.println("\nArrayList after removing the third element:");
            for (String e : elementsList) {
                System.out.println(e);
            }
        } else {
            System.out.println("\nNot enough elements to remove the third element.");
        }

        scanner.close();
    }
}
