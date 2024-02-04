import java.util.LinkedList;
import java.util.Scanner;

public class ll9 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Get user input for the elements to insert
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
        System.out.println("Original Linked List:");
        displayLinkedList(linkedList);

        // Get user input for the element to insert
        System.out.println("\nEnter the element to insert:");
        String elementToInsert = scanner.nextLine();

        // Get user input for the position to insert
        System.out.println("Enter the position to insert:");
        int positionToInsert = scanner.nextInt();

        // Check if the position is valid
        if (positionToInsert >= 0 && positionToInsert <= linkedList.size()) {
            // Insert the element at the specified position
            linkedList.add(positionToInsert, elementToInsert);

            // Display the linked list after insertion
            System.out.println("\nLinked List after insertion at position " + positionToInsert + ":");
            displayLinkedList(linkedList);
        } else {
            System.out.println("\nInvalid position. Please enter a valid position.");
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
