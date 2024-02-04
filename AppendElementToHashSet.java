import java.util.HashSet;
import java.util.Scanner;

public class AppendElementToHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // Get user input for the element to append
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to append:");
        String elementToAppend = scanner.nextLine();

        // Append the element to the end of the hash set
        hashSet.add(elementToAppend);

        // Display the hash set after appending
        System.out.println("Hash Set after appending:");
        displayHashSet(hashSet);

        scanner.close();
    }

    // Helper method to display the elements of a hash set
    private static void displayHashSet(HashSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
