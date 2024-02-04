import java.util.LinkedList;
import java.util.Scanner;

public class InsertAtFront {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");

        // Get user input for the element to insert at the front
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to
