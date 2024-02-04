import java.util.HashSet;

public class TestHashSetIsEmpty {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // Test if the hash set is empty
        boolean isEmpty = hashSet.isEmpty();

        if (isEmpty) {
            System.out.println("The hash set is empty.");
        } else {
            System.out.println("The hash set is not empty.");
        }
    }
}
