import java.util.LinkedList;
import java.util.ListIterator;

public class IterateInReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");

        // Iterate through the linked list in reverse order
        System.out.println("Iterating through the linked list in reverse order:");
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
