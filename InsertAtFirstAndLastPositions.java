import java.util.LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class InsertAtFirstAndLastPositions {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");

        // Get user input for elements to insert at the first and last positions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to insert at the first position:");
        String firstElement = scanner.next();
        linkedList.addFirst(firstElement);

        System.out.println("Enter the element to insert at the last position:");
        String lastElement = scanner.next();
        linkedList.addLast(lastElement);

        // Display the linked list after insertion at first and last positions
        System.out.println("Linked List after insertion at first and last positions:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        scanner.close();
    }
}
