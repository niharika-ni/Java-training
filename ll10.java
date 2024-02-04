import java.util.LinkedList;
import java.util.Scanner;

public class ll10 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Get user input for elements to add to the linked list
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'exit' to finish):");

        String element;
        while (true) {
            element = scanner.nextLine();

            if (element.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the element to the linked list
            linkedList.add(element);
        }

        // Display the original linked list
        System.out.println("\nOriginal Linked List:");
        displayLinkedList(linkedList);

        // Get user input for the element to find occurrences
        System.out.println("\nEnter the element to find occurrences:");
        String elementToFind = scanner.nextLine();

        // Find the first occurrence index
        int firstIndex = linkedList.indexOf(elementToFind);

        // Find the last occurrence index
        int lastIndex = linkedList.lastIndexOf(elementToFind);

        // Display the results
        if (firstIndex != -1) {
            System.out.println("\nFirst occurrence of '" + elementToFind + "' at index: " + firstIndex);
        } else {
            System.out.println("\nElement '" + elementToFind + "' not found in the linked list.");
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence of '" + elementToFind + "' at index: " + lastIndex);
        } else {
            System.out.println("Element '" + elementToFind + "' not found in the linked list.");
        }

        scanner.close();
    }

    // Helper method to display the elements of a linked list
    private static void displayLinkedList(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
}
