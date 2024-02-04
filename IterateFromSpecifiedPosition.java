import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromSpecifiedPosition {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");

        int startPosition = 1; // Starting at the second position

        // Iterate through all elements starting at the specified position
        System.out.println("Iterating through all elements starting at position " + startPosition + ":");
        ListIterator<String> iterator = linkedList.listIterator(startPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
