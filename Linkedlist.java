import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Get user input for the element to append
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to append:");
        String elementToAppend = scanner.nextLine();

        // Append the element to the end of the linked list
        linkedList.add(elementToAppend);

        // Display the linked list after appending
        System.out.println("Linked List after appending:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        scanner.close();
    }
}
