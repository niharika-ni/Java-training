import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapAssociation {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> hashMap = new HashMap<>();

        // Get user input for key and value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key:");
        String key = scanner.nextLine();

        System.out.println("Enter the value:");
        String value = scanner.nextLine();

        // Associate the specified value with the specified key in the HashMap
        hashMap.put(key, value);

        // Display the HashMap
        System.out.println("\nHashMap elements:");
        displayHashMap(hashMap);

        scanner.close();
    }

    // Helper method to display the elements of a HashMap
    private static void displayHashMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
