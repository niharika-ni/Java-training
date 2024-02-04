import java.util.HashSet;

public class GetNumberOfElementsInHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");

        // Get the number of elements in the hash set
        int numberOfElements = hashSet.size();
        System.out.println("Number of elements in the hash set: " + numberOfElements);
    }
}
