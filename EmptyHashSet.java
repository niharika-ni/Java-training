import java.util.HashSet;

public class EmptyHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");

        // Display the original hash set
        System.out.println("Original Hash Set:");
        displayHashSet(hashSet);

        // Empty the hash set
        hashSet.clear();

        // Display the hash set after emptying
        System.out.println("Hash Set after emptying:");
        displayHashSet(hashSet);
    }

    // Helper method to display the elements of a hash set
    private static void displayHashSet(HashSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
