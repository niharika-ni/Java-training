import java.util.HashSet;

public class IterateThroughHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");

        // Iterate through all elements in the hash set
        System.out.println("Iterating through all elements in the hash set:");
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}
