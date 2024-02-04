import java.util.LinkedList;

public class IterateThroughAllElements {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");

        // Iterate through all elements in the linked list
        System.out.println("Iterating through all elements in the linked list:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
