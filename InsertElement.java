import java.util.LinkedList;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");

        // Get user input for the element and position to insert
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to insert:");
        String elementToInsert = scanner.nextLine();
        System.out.println("Enter the position to insert:");
        int positionToInsert = scanner.nextInt();

        // Insert the element at the specified position
        linkedList.add(positionToInsert, elementToInsert);

        // Display the linked list after insertion
        System.out.println("Linked List after insertion at position " + positionToInsert + ":");
        for (String element : linkedList) {
            System.out.println(element);
        }

        scanner.close();
    }
}
